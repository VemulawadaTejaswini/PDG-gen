import java.util.*;

class atCoder_110_B {
	public static void main (String[] args) {
		Scanner scanner1 = new Scanner(System.in);
		int numN = scanner1.nextInt();
		int numM = scanner1.nextInt();
		int numX = scanner1.nextInt();
		int numY = scanner1.nextInt();
		
		/*
		System.out.println("N = " + numN);
		System.out.println("M = " + numM);
		System.out.println("X = " + numX);
		System.out.println("Y = " + numY);
		*/
		
		Scanner scanner2 = new Scanner(System.in);
		List<Integer> xlist = new ArrayList();
		for (int i = 1; i <= numN; i++) {
			int x_i = scanner2.nextInt();
			
			if (x_i != numX) {
				xlist.add(new Integer(x_i));
				//System.out.println("x" + i + " = " + xlist.get(i-1));
			}
		}
		
		Scanner scanner3 = new Scanner(System.in);
		List<Integer> ylist = new ArrayList();
		for (int j = 1; j <= numM; j++) {
			int y_j = scanner3.nextInt();
			
			if (y_j != numY) {
				ylist.add(new Integer(y_j));
				//System.out.println("y" + j + " = " + ylist.get(j-1));
			}
		}
		
		//System.out.println("xlist max = " + Collections.max(xlist));
		//System.out.println("ylist max = " + Collections.min(ylist));
		
		int z = Collections.max(xlist);
		if (Collections.min(ylist) >= z) {
			if (numX < z && z <= numY) {
				System.out.println("No War");
			} else {
				System.out.println("War");
			}
		} else {
			System.out.println("War");
		}
	}
}