import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for (int i = 0; i < n; i++) {
        	a[i]=sc.nextInt();
		}
        Arrays.sort(a);
        int ans=a[0];
        for(int i=1;i<n;i++) {
        	
        	if(i!=0) {
        		a[i]%=a[0];
        	}
        	
        }
        Arrays.sort(a);
        System.out.println(a[n-2]==0?ans:"1");
        
    }
}
