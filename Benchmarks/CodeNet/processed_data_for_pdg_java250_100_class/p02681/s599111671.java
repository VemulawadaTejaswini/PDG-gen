public class Main {
    public static void main(String[] args) {
        Scanner inStr = new Scanner(System.in);
        String S = inStr.nextLine();
        String T = inStr.nextLine();
        inStr.close();
        if (Pattern.matches("[a-z]{1,10}", S) && Pattern.matches("[a-z]+", T)
                && T.length() == S.length() + 1) {
            String subStr = T.substring(0, S.length());
            if (S.equals(subStr)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        } else {
            System.out.println("No");
        }
    }
}
