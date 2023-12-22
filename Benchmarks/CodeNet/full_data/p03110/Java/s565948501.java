import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		double [] in = new double [a];
        for(int i=0;i<a;i++){in[i] = sc.nextDouble();
                             String s = sc.next();
                             if(s.equals("BTC")){in[i]*=380000;}
                            }
        double ans = 0;
		
        for(int i=0;i<a;i++){ans+=in[i];
                            }
        
		System.out.println(ans);
	}
}
