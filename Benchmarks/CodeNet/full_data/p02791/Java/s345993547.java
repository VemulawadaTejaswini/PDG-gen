import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		// 入力値
		int n = sc.nextInt();
		int[] p = new int[n];
		for(int i=0;i<n;i++){
			p[i] = sc.nextInt();
		}
		sc.close();
		int r = n;
		int max = p[0];
		for(int i=0;i<n;i++){
			if(max<p[i]){
				r--;
			}else{
				max = p[i];
			}
		}
		System.out.println(r);
	}
}