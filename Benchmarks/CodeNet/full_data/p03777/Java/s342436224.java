package AtCoder;
import java.util.*;
public class NarrowRectanglesEasy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int W=sc.nextInt();
		int a=sc.nextInt();
		int b=sc.nextInt();
		int z=Math.abs(a-b);
		if(z<=W) {
			z=0;
		}else{
			z=z-W;
		}
		System.out.println(z);

	}

}
