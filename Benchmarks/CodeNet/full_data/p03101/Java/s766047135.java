import java.util.Scanner;

class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int A = sc.nextInt();
       	int B =sc.nextInt();
       	int a =sc.nextInt();
       	int b =sc.nextInt();

       	int ans = (A-a) * (B-b);

       	System.out.println(ans);
}

}
