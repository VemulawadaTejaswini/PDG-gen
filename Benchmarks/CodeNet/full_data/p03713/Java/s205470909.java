import java.util.*;
import java.io.*;

public class Main {
	
	public static int unfair(int a, int b, int c){
		int max = a;
		int min = a;
		if(max<b)max=b;
		if(min>b)min=b;
		if(max<c)max=c;
		if(min>c)min=c;
		return max-min;
	}
	
	public static int div1(int H, int W){
		//upper parts leq than 1/3
		int upper = H/3;
		int piece1 = upper*W;
		int lower = H-upper;
		return Math.min(unfair(piece1, (lower/2)*W, (lower-(lower/2))*W),
						unfair(piece1, (W/2)*lower, (W-(W/2))*lower));
	}
	public static int div2(int H, int W){
		//upper parts geq than 1/3
		int upper = 1+H/3;
		int piece1 = upper*W;
		int lower = H-upper;
		return Math.min(unfair(piece1, (lower/2)*W, (lower-(lower/2))*W),
						unfair(piece1, (W/2)*lower, (W-(W/2))*lower));
	}
	
	public static int div3(int H, int W){
		//left parts leq than 1/3
		return div1(W,H);
	}
	public static int div4(int H, int W){
		//left parts geq than 1/3
		return div2(W,H);
	}
	
	
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        int ans = Math.min(Math.min(div1(H,W),div2(H,W)),Math.min(div3(H,W),div4(H,W)));
        System.out.println(ans);
    }    
}