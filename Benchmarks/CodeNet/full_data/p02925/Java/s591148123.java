import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        int[][] a = new int[n][n-1];
        for(int i=0; i<n; i++){
            for(int j=0; j<n-1; j++){
                a[i][j] = Integer.parseInt(sc.next())-1;
            }
        }
        
        int[] idx = new int[n];
        TreeSet<Integer> s = new TreeSet<Integer>();
        
        for(int k=0; k<=n*(n-1)/2; k++){
            int cnt = 0;
            for(int i=0; i<n; i++){
                for(int j=i+1; j<n; j++){
                    if(n-1<=idx[i] || n-1<=idx[j]){
                        cnt++;
                        continue;
                    }
                    if(a[i][idx[i]]==j && a[j][idx[j]]==i){
                        s.add(i);
                        s.add(j);
                    }
                }
            }
            
            if(s.isEmpty()){
                System.out.println(-1);
                System.exit(0);
            }
            
            while(!s.isEmpty()){
                int x = s.pollFirst();
                idx[x]++;
            }
            
            if(done(idx, n)){
                System.out.println(k+1);
                System.exit(0);
            }
        }
        
        
    }
    
    public static boolean done(int[] idx, int n){
        for(int i=0; i<n; i++){
            if(idx[i]!=n-1){
                return false;
            }
        }
        
        return true;
    }
}