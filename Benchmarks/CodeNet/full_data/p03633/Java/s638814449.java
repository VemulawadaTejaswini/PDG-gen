import java.util.*;
public class Main {
	
    public static Long gcd(Long x,Long y){
        if(x < y) return gcd(y, x);
        if(y == 0) return x;
        return gcd(y, x % y);
    }
    public static Long lcm(Long x,Long y){                                                              
        return x/gcd(x,y)*y;                                                                                                                                                                                                                
    }
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		Long [] in = new Long [a];
        for(int i=0;i<a;i++){
                             in[i] = sc.nextLong();
                            }
        Arrays.sort(in);
        Long ans = in[a-1];
        for(int i=1;i<a;i++){ans = lcm(ans,in[i]);
                              }        
		System.out.println(ans);
	}
}
