import java.util.*;

public class Main{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        int q = Integer.parseInt(sc.next());
        char[] s = sc.next().toCharArray();
        int[] a = new int[n];
        for(int i=0; i<n-1; i++){
            if(s[i]=='A'&&s[i+1]=='C'){
                a[i+1] = 1;
            }
        }
        for(int i=0; i<n-1; i++){
            a[i+1] += a[i];
        }
        
        for(int i=0; i<q; i++){
            int l = Integer.parseInt(sc.next())-1;
            int r = Integer.parseInt(sc.next())-1;
            System.out.println(a[r]-a[l]);
        }
    }
}
