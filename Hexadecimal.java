public class Hexadecimal {

    public static void convert(String input) {
        StringBuilder hex = new StringBuilder();
        for (char c : input.toCharArray()) {
            hex.append(Integer.toHexString((int) c)).append(" ");
        }
        System.out.println("Texte en Hexadecimal: " + hex.toString().trim());
    }
}