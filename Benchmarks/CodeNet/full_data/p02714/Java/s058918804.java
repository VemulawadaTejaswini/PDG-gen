
import java.util.Arrays;
import java.util.Scanner;
 
class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();
        int[] R = new int[N];
        int[] G = new int[N];
        int[] B = new int[N];
        int r = 0 ,g = 0, b = 0;
        long ans = 0;
        sc.close();
        
        for(int i = 0; i < N; i++) {
        	if(S.charAt(i) == 'R') {
        		R[r] =  i;
        		r++;
        	}
        	if(S.charAt(i) == 'G') {
        		    G[g] = i;
        		    g++;
        	}
        	if(S.charAt(i) == 'B') {
        		B[b] = i;
        		b++;
        	}
        }
        
        
        for(int i = 0; i < r; i++) {
            for(int j = 0; j < g; j++) {
                for(int k = 0; k < b; k++) {
                    int[] ijk = new int[3]; 
                    ijk[0] = R[i];
                    ijk[1] = G[j];
                    ijk[2] = B[k];
                    Arrays.sort(ijk);
                    if(ijk[1] - ijk[0] != ijk[2] -ijk[1]) {
                    	ans++;
                    }
                }   
            }
        
        }
        
        System.out.println(ans);
        
	}
}

