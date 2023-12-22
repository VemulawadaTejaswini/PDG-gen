import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int times = sc.nextInt();
		int [] Cx = new int[times];
		int [] Cy = new int[times];
		int [] h = new int[times];
		int H = 0;        // H = h+(|X−CX|+|Y−CY)
		boolean ff = false;
		
	//	ArrayList<Integer> judge = new ArrayList<Integer>();
		
		
		
		for(int i = 0 ; i<times; i++) {
			Cx[i] = sc.nextInt();
			Cy[i] = sc.nextInt();
			h[i] = sc.nextInt();
		}

		for(int i = 0 ; i<=100; i++) {
			for(int j = 0 ; j<=100; j++) {
				int judge = 0;
				H = Math.abs(i-Cx[0])+Math.abs(j-Cy[0])+h[0];
				if(H>0) {
					for(int k = 0 ; k<times; k++) {
						int compare = Math.abs(i-Cx[k])+Math.abs(j-Cy[k])+h[k];
						if(H==compare) {
							judge++;
						}
					}
					if(judge==times) {
						System.out.println(i+" "+j+" "+H);
						ff = true;
						break;
					}
				}
			}
			if(ff==true) {
				break;
			}
		}
	}
}
