import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int n1 = sc.nextInt();
		int n2 = sc.nextInt();

		String s3 = sc.next();

		int n4[][] = new int[n2][4];

		for(int i = 0; i < n2; i++){
			n4[i][0] = i;
			n4[i][1] = sc.nextInt();
			n4[i][2] = sc.nextInt();
			n4[i][3] = 0;		
		}

		boolean f5 = false;

		for(int j = 0; j < n1; j++){
			if (s3.charAt(j) == 'A'){
				f5 = true;
			}else if(s3.charAt(j) == 'C' && f5 == true){
				for(int k = 0; k < n2; k++){
					if (n4[k][1] <= j && n4[k][2] >= j + 1){
						n4[k][3]++;
					}
				}
				f5 = false;
			}
		}
		for(int l = 0; l < n2; l++){
			System.out.println(n4[l][3]);		
		}	
	}
}