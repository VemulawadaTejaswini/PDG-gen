package AtCoder;

public class NarrowRectanglesEasy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int W=3;
		int a=2;
		int b=6;
		int z=Math.abs(a-b);
		if(z<=W) {
			z=0;
		}else{
			z=z-W;
		}
		System.out.println(z);

	}

}
