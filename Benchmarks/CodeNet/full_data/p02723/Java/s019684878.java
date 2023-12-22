public class Main {

    public static void main(String[] args) {
        final char[] chars = args[0].toCharArray();
        if (chars[2] == chars[3] && chars[4] == chars[5]) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
