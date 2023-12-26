public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String T = sc.next();
        String Tmatch=T.substring(0, S.length());
        if (Tmatch.equals(S) ){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        sc.close();
    }
}
