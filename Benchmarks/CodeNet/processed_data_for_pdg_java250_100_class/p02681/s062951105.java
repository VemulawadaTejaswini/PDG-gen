public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String T = sc.next();
        int lgt = S.length();
        if(T.substring(0,lgt).equals(S)){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
