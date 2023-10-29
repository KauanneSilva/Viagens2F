import java.util.Scanner;

public class Validacao {
    public static void main(String[] args) {
        System.out.println("Digite seu cpf (somente números): ");
        Scanner tcd = new Scanner(System.in);
        String cpf = tcd.nextLine();

        if (Util.validaCPF(cpf)) {
            System.out.println("CPF OK");
        } else {
            System.out.println("CPF Inválido!");
        }

        tcd.close();
    }
}

class Util {
    public static boolean validaCPF(String cpf) {
        if (cpf == null || cpf.length() != 11 || !cpf.chars().allMatch(Character::isDigit)) {
            return false;
        }

        char firstDigit = cpf.charAt(0);
        boolean allDigitsAreSame = true;
        for (int i = 1; i < 11; i++) {
            if (cpf.charAt(i) != firstDigit) {
                allDigitsAreSame = false;
                break;
            }
        }
        if (allDigitsAreSame) {
            return false;
        }

        int[] numbers = new int[11];
        for (int i = 0; i < 11; i++) {
            numbers[i] = Character.getNumericValue(cpf.charAt(i));
        }

        for (int i = 0; i < 2; i++) {
            int sum = 0;
            for (int j = 0; j < 9 + i; j++) {
                sum += numbers[j] * (10 + i - j);
            }

            int checkDigit = sum % 11;
            checkDigit = checkDigit < 2 ? 0 : 11 - checkDigit;

            if (checkDigit != numbers[9 + i]) {
                return false;
            }
        }

        return true;
    }
}

}
