import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();
        String t1 = S.substring(0, N/2+1);
        String t2 = S.substring(N/2+1, N+1);
        if (t1==t1) {
        		System.out.println("Yes");
        } else {
        	System.out.println("No");
        }
    }
}