import java.util.Scanner;
 
public class Main {
	
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
 		int n = scan.nextInt();
		String S = scan.next();
		String a[] = new String[S.length()];

		for(int i=0;i< S.length();i++) {
			a[i]=S.substring(i, i+1);
		}

		int min = Integer.MAX_VALUE;
		for(int i=0;i<S.length();i++){
			int minj = 0;
			for(int j=0;j<i;j++){
				if(a[j].equals("W")){
					minj += 1;
				}
			}
			for(int j=i+1;j<S.length();j++){
				if(a[j].equals("E")){
					minj += 1;
				}
			}

			min = Math.min(minj,min);
		}

		System.out.println(min);
	}
 
}