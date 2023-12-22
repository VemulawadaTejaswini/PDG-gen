import java.util.Scanner;

public class Main {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.close();

        if(a==b && b== c){
            System.out.print("-1");
            return;
        }

        for(int i=1; i>0; i++){
            int ta = b/2 + c/2;
            int tb = a/2 + c/2;
            int tc = a/2 + b/2;
            a = ta;
            b = tb;
            c = tc;
            if(a%2==1 || b%2 == 1 || c%2 == 1){
                System.out.print(i);
                break;
            }
        }
	}
}