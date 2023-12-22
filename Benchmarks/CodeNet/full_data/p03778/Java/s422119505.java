package AtCoder;

public class NarrowRectanglesEasy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int W=Integer.parseInt(args[0]);
		int a=Integer.parseInt(args[1]);
		int b=Integer.parseInt(args[2]);
		int z=Math.abs(a-b);
		if(z<=W) {
			z=0;
		}else{
			z=z-W;
		}
		System.out.println(z);

	}

}
