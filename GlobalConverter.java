import java.util.Scanner;

public class GlobalConverter {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrez le texte à convertir:");
        String input = scanner.nextLine();

        System.out.println("Choisissez votre option de conversion (h: Hexadecimal, o: Octal, b: Binary, t: Text en César):");
        String choix = scanner.nextLine();

        switch (choix) {
            case "h":
                Hexadecimal.convert(input);
                break;
            case "o":
                Octal.convert(input);
                break;
            case "b":
                Binary.convert(input);
                break;
            case "t":
                System.out.println("Entrez le décalage pour le chiffrement de César:");
                int shift = scanner.nextInt();
                scanner.nextLine(); 
                Text.convert(input, shift);
                break;
            default:
                System.out.println("Choix non reconnu.");
                break;
        }

        scanner.close();
    }
}
