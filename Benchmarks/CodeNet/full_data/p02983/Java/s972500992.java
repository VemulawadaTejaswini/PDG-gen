import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int L = Integer.parseInt(sc.next());
        int R = Integer.parseInt(sc.next());
        sc.close();
        int ans = 0;
        int i = mod2019(L); 
        int j = 2018;int  memo = 0;
        //mod2019が最小の時のkをmemoに書き込む
        for(int k = L;k <= R && (k <= (k + 2019));k++){         
            i = Math.min(mod2019(k) , i);    
            if(mod2019(memo) != i){
                memo = k;
            }      
        }
        
        for(int k = L;k <= R && (k <= (k + 2019));k++){
        	if(k != memo) {      		
        		j = Math.min(mod2019(k) , j);
        	}
        }   
        ans = mod2019(i * j);     
        System.out.println(ans);
    }
    private static int mod2019(int n){
        return n % 2019;
    }
}