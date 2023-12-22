import java.util.*;  

public class Main {
	public static Long Ln(long x){
        if(x<=1){return x;                                         
                } else {return 2*Ln(x/2);                                                                                         
                       }                                                                                                
    }       
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Long a = sc.nextLong();
        b = L(a);
		System.out.println(b);   
	}   
}

