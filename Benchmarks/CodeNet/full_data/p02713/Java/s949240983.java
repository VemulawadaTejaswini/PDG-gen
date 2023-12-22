import java.util.*;
public class Main {
	
    public static int gcd(int x,int y){
        if(x < y) return gcd(y, x);
        if(y == 0) return x;
        return gcd(y, x % y);
    }
  
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
        int b;
        int ans = 0;
        for(int i=1;i<=a;i++){
        for(int j=1;j<=a;j++){b = gcd(i,j);
        for(int k=1;k<=a;k++){ans+=gcd(b,k);
                           
                            }               
                            }                 
                            }
        
     
		System.out.println(ans);
	}
}
