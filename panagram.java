
public class panagram {
    public static void main(String[] args) {
        System.out.println(isPangram("The quick brown fox jumps over the lzy dog"));
    }

    public static boolean isPangram(String s) {
        boolean[] alphabet = new boolean[26];
        int index;

        for (int i = 0; i < s.length(); i++) {
            char c = Character.toLowerCase(s.charAt(i));
            if ('a' <= c && c <= 'z') {
                index = c - 'a';
                alphabet[index] = true;
            }
        }

        for (boolean b : alphabet) {
            if (!b) {
                return false;
            }
        }

        return true;
    }
}