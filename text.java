public class Text {

    public static void convert(String input, int shift) {
        StringBuilder caesar = new StringBuilder();
        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                char base = Character.isLowerCase(c) ? 'a' : 'A';
                caesar.append((char) ((c - base + shift) % 26 + base));
            } else {
                caesar.append(c);
            }
        }
        System.out.println("Texte en César: " + caesar.toString());
    }
}