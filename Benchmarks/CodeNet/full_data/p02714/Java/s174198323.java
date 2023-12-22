import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S = sc.next();
		char[] C = S.toCharArray();
		sc.close();

		int cnt = 0;
		for(int i=0; i<N; i++){
			for(int j=i+1; j<N; j++){
				for(int k=j+1; k<N; k++){
					if(C[i]==C[j] || C[i]==C[k] || C[j]==C[k]){
						continue;
					}
					if(j-i==k-j){
						continue;
					}
					cnt++;
				}
			}
		}

		
		System.out.printf("%d\n", cnt);
	}
}