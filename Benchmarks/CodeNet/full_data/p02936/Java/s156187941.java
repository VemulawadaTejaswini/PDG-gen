import java.util.*;
 
public class Main{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int q=sc.nextInt();
        int[][] a= new int[2][n-1];
        int[][] p = new int[2][q];
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0;i<n-1;i++) { /*親と子の関係を入れる*/
        	a[0][i]=sc.nextInt();
        	a[1][i]=sc.nextInt();
        	map.put(a[1][i],a[0][i]);
        }
        int[] count = new int[n];
        Arrays.fill(count, 0);
        for(int i=0;i<q;i++) {/* 値を記録*/
        	p[0][i]=sc.nextInt();
        	p[1][i]=sc.nextInt();
        	count[p[0][i]-1]+=p[1][i];
        }
        for(int i=1;i<n;i++) {
        	count[i]+=count[map.get(i+1)-1];
        }
        for(int i=0;i<n;i++) {
        	System.out.println(count[i]);
        }
        }
    
    
}
