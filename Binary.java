public class Binary {

    public static void convert(String input) {
        StringBuilder binary = new StringBuilder();
        for (char c : input.toCharArray()) {
            binary.append(Integer.toBinaryString((int) c)).append(" ");
        }
        System.out.println("Texte en Binary: " + binary.toString().trim());
    }
}
