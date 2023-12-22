import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(); 
        int b = sc.nextInt();
        int c = 0;
        double ans = 0;
        double d;
		double [] in1 = new double [a];
        int f,g;      
        for(int i=0;i<a;i++){f = sc.nextInt();
                             g = sc.nextInt();
                             in1[i] = f+g*0.000001;                           
                            }
		Arrays.sort(in1);       		
        for(int i=0;i<a;i++){d = Math.floor(in1[i]);
                             c+=(in1[i]-d)*1000000;
                             if(c>=b){ans=d;break;}
                            }                                                      
		System.out.println(ans);
	}
}
