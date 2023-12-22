import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int w = sc.nextInt(), h = sc.nextInt(), n = sc.nextInt();
		
		int lx = 0, rx = w;
		int ly = 0, ry = h;
		
		for(int i=0;i<n;i++){
			int x = sc.nextInt(), y = sc.nextInt(), a = sc.nextInt();
			if(a==1)
				lx = Math.max(x, lx);
			else if(a==2)
				rx = Math.min(rx, x);
			else if(a==3)
				ly = Math.max(ly, y);
			else
				ry = Math.min(ry, y);
		}
		
		if(ry<=ly || rx<=lx)
			System.out.println(0);
		else
			System.out.println((rx-lx) * (ry-ly));
	}

}
