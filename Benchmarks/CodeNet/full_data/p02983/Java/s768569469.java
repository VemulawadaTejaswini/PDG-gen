import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int L = Integer.parseInt(sc.next());
        int R = Integer.parseInt(sc.next());
        sc.close();
        int ans = 0;
        int i = mod2019(L); 
        int j = mod2019(L);
        for(int k = L;k < R;k++){
            i = Math.min(mod2019(k) , i);
          
        }
        j += 2;
        for(int k = L;k <= R;k++){
        	if(mod2019(k) != i) {
        		
        		j = Math.min(mod2019(k) , j);
        	}
        }   
        ans = mod2019(i * j);
       
        System.out.println(ans);
    }
    static int mod2019(int n){
        return n % 2019;
    }
}