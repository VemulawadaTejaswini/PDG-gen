import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] a = new int[n];
		for(int i=0; i<n; i++){
			a[i] = scn.nextInt();
		}
      	int k = -1;
      	int 5k = -1;
      	int 10k = -1;
      	int num = 0;
      	for(int i=0; i<=n; i++){
          for(int j=0; j<=n-i; j++){
            num = 1000*i + 5000*j + 10000*(n-j-i);
            if(num==y){
              k=i;
              5k=j;
              10k=n-j-i;
            }
          }
        }
      	Sytem.out.println(k + " " + 5k + " " + 10k);
	}
}