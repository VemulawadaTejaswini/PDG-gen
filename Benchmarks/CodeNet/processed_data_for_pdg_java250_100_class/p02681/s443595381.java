public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String S = s.next();
        String T = s.next();
        char[] sc = S.toCharArray();
        char[] tc = T.toCharArray();
        if((tc.length - sc.length) > 1) {
            System.out.println("No");
        }
        for (int i = 0; i < tc.length; i++) {
            if(i < sc.length && sc[i] != tc[i]){
                System.out.println("No");
                break;
            }
            if(i == tc.length-1) {
                System.out.println("Yes");
            }
        }
    }
}
