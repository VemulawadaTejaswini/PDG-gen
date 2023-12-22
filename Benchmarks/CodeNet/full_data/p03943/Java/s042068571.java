import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a>b && a>c) {
        	if(a==(b+c)) {
        		System.out.println("Yes");
        		System.exit(0);
        	}
        	else {
        		System.out.println("No");
        		System.exit(0);
        	}
        }
        else if(b>a && b>c) {
        	if(b==(a+c)) {
        		System.out.println("Yes");
        		System.exit(0);
        	}
        	else {
        		System.out.println("No");
        		System.exit(0);
        	}
        }
        else {
        	if(c==(a+b)) {
        		System.out.println("Yes");
        		System.exit(0);
        	}
        	else {
        		System.out.println("No");
        		System.exit(0);
        	}
        }
    }
}

