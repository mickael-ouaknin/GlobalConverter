public class Octal {

    public static void convert(String input) {
        StringBuilder octal = new StringBuilder();
        for (char c : input.toCharArray()) {
            octal.append(Integer.toOctalString((int) c)).append(" ");
        }
        System.out.println("Texte en Octal: " + octal.toString().trim());
    }
}