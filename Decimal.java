import java.util.Scanner;

public class Decimal {
    
    public static String wordToDecimal(String word) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < word.length(); i++) {
            int decimalValue = (int) word.charAt(i);
            result.append(decimalValue);

       
            if (i < word.length() - 1) {
                result.append(" ");
            }
        }

        return result.toString();
    }

   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrez le mot à traduire en décimal :");
        String word = scanner.nextLine();

        String decimalRepresentation = wordToDecimal(word);
        System.out.println("Représentation décimale : " + decimalRepresentation);
    }
}
