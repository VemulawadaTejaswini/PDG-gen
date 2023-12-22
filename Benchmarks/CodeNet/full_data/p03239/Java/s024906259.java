import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int t = sc.nextInt();
		int[] c = new int[n];
		int[] ct = new int[n];
		int ans = 1000;
		int tleflg = 1;
		
		for(int i=0; i<n; i++){
		    c[i] = sc.nextInt();
		    ct[i] = sc.nextInt();
		    if(c[i] < ans && ct[i] <= t){
		        ans = c[i];
		        tleflg = 0;
		    }
		}
		
		if(tleflg == 1){
		    System.out.println("TLE");
		}else{
		    System.out.println(ans);
		}
    }
}