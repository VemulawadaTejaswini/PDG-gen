import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int t = sc.nextInt();
		int[] c = new int[n];
		int[] ct = new int[n];
		int tleflg = 1;
		
        for(int i = 0; i < n; i++){
        	c[i] = sc.nextInt();
          	ct[i] = sc.nextInt();
        }
      	int ans = c[0];

        for(int i=0; i<n; i++){
        	if(ct[i]<=t){
        	    if(ans>c[i]){
        	        ans = c[i];
        	    }
              tleflg =0;
            }
        }
      if(tleflg==1){
        System.out.println("TLE");
      }else{
      	System.out.println(ans);
      }
    }
}