package br.com.bank.model.service;

public class ValidorCPF {

    public static boolean validarCPF(String cpf) {
        // Remove caracteres que não são dígitos
        cpf = cpf.replaceAll("[^0-9]", "");

        // Verifica se o CPF possui 11 dígitos
        if (cpf.length() != 11)
            return false;

        // Verifica se todos os dígitos são iguais
        boolean digitosIguais = true;
        for (int i = 1; i < 11; i++) {
            if (cpf.charAt(i) != cpf.charAt(0)) {
                digitosIguais = false;
                break;
            }
        }
        if (digitosIguais)
            return false;

        // Calcula o primeiro dígito verificador
        int soma = 0;
        for (int i = 0; i < 9; i++) {
            soma += (cpf.charAt(i) - '0') * (10 - i);
        }
        int digito1 = 11 - (soma % 11);
        if (digito1 > 9)
            digito1 = 0;

        // Verifica o primeiro dígito verificador
        if ((cpf.charAt(9) - '0') != digito1)
            return false;

        // Calcula o segundo dígito verificador
        soma = 0;
        for (int i = 0; i < 10; i++) {
            soma += (cpf.charAt(i) - '0') * (11 - i);
        }
        int digito2 = 11 - (soma % 11);
        if (digito2 > 9)
            digito2 = 0;

        // Verifica o segundo dígito verificador
        if ((cpf.charAt(10) - '0') != digito2)
            return false;

        return true;
    }

    public static void main(String[] args) {
        // Testando a validação de CPF
        String cpf = "123.456.789-0";
        if (validarCPF(cpf)) {
            System.out.println("CPF válido");
        } else {
            System.out.println("CPF inválido");
        }
    }
}
