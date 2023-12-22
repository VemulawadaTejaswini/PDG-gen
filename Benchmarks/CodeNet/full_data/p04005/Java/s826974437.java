import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
		sc.close();
		if(a%2==1 && b%2==1 && c%2==1){
            System.out.println(a*b*c/(Math.max(Math.max(a,b), c)));
        }else{
        	System.out.println("0");
        }
	}
}
