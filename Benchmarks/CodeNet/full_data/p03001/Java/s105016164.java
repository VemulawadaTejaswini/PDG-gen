import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();		
        int h = sc.nextInt();
		int x = sc.nextInt();
        int y = sc.nextInt();
        double ans1 = w*h/2.0;
        int ans2 = 0;
        if(x*2==w && y*2==h){ans++;}
		System.out.println(ans1 + " " + ans2);
	}
}
