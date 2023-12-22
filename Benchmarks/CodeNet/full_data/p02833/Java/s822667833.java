import java.util.*;  

public class Main {	
    public static Long gcd(Long x,Long y){
        if(x < y) return gcd(y, x);
        if(y == 0) return x;
        return gcd(y, x % y);
    }
    public static Long lcm(Long x,Long y){                                                              
        return x*y/gcd(x,y);                                                                                                                                                                                                                
    }
    public static Long df1(Long x){                                                              
        return x/5 + x/25 + x/125 + x/625 + x/3125 + x/15625;
    }
    public static Long df2(Long x){                     
        return df1(x/15625);
    }
    public static Long df3(Long x){                     
        return df2(x/15625);
    }
    public static Long df4(Long x){                     
        if((x+1)%2==0) return (x+1)%2; 
        return df1(x/2)+df2(x/2)+df3(x/2);
    }
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Long a = sc.nextLong();
        Long b = df4(a);
		System.out.println(b);   
	}   
}

