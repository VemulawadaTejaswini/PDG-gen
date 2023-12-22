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
        if(x==0) return x+1; 
        return 5*df1(x-1);
    }
    public static Long df2(Long x){                     
        return x/df1(1) + x/df1(2) + x/df1(3) + x/df1(4) + x/df1(5) + x/df1(6);
    }
    public static Long df3(Long x){                     
        return x/df1(7) + x/df1(8) + x/df1(9) + x/df1(10) + x/df1(11) + x/df1(12);
    }
    public static Long df4(Long x){                     
        return x/df1(13) + x/df1(14) + x/df1(15) + x/df1(16) + x/df1(17) + x/df1(18);
    }
    public static Long df5(Long x){                     
        if((x+1)%2==0) return (x+1)%2; 
        return df2(x/2)+df3(x/2)+df4(x/2);
    }
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Long a = sc.nextLong();
        Long b = df5(a);
		System.out.println(b);   
	}   
}

