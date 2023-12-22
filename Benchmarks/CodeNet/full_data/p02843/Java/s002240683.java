import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
        Scanner stdin = new Scanner(System.in);
        int list[] = {100,101,102,103,104,105};

        int X = stdin.nextInt();
        int flag=0;

        int s = X%100;
        int d = X/100;


        if(s/5<=d) {
        	if(s/5+2<=d ||s/5+1<=d) {
        		System.out.print("1");
        	}
        }
        else {
        	System.out.print("0");
        }
	}
}
