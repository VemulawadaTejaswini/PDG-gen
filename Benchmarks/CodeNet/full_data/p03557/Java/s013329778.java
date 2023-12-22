import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[n];
        int cnt = 0;
        int tmp = n-1;
        int temp = n-1;
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        
        for(int i=0; i<n; i++){
            b[i] = sc.nextInt();
        }
        Arrays.sort(b);
        
        for(int i=0; i<n; i++){
            c[i] = sc.nextInt();
        }
        Arrays.sort(c);
        
        
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(a[i]>=b[j]){
                    temp = j;
                    break;
                }
                for(int k=0; k<n; k++){
                    if(b[j]>=c[k]){
                        tmp = k;
                        break;
                    }
                    if(a[i]<b[j] && b[j]<c[k]){
                        
                        cnt++;
                    }
                }
                if(b[j]>=c[tmp]) break;
            }
            if(a[i]>=b[temp]) break;
            
        }
        System.out.println(cnt);
	}
}