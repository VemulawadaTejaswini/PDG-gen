import java.util.*;
// . >
class Main{
	static Scanner in = new Scanner(System.in);

	public static void main(String args[]){	
		// String a = in.nextLine();
		int n = scInt();
		int arr[][] = new int[n][2];
		
		for(int i = 0; i < n; i++){
			arr[i][0] = scInt();
			arr[i][1] = scInt();
		}

		long ind1 = arr[0][0];
		long ind2 = arr[0][1];
		for(int i = 1; i < n; i++){
			int a = arr[i][0], b = arr[i][1];
			if(a == b){
				ind1 = (long)Math.max(ind1, ind2);
				ind2 = (long)Math.max(ind1, ind2);
			}else if(a < b){
				ind1 = ind1 + (ind1 % a);
				ind2 = ind1 / a * b;
			} else{
				ind2 = ind2 + (ind2 % b);
				ind1 = ind2 / b * a;
			}
			// pl(ind1 + " " + ind2);
		}

		pl( ind1 + ind2 + "");
		
	}

	public static int scInt(){return in.nextInt();}
	public static double scDbl(){return in.nextDouble();}
	public static String scStr(){return in.next();}
	public static String scLne(){return in.nextLine();}

	public static void pl(String s){System.out.println(s);}	

}
