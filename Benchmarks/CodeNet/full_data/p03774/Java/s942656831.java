import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
        int e = sc.nextInt();
		int [] x1 = new int [a];
        int [] y1 = new int [a];
        int [] x2 = new int [e];
        int [] y2 = new int [e];
        int [] ans = new int [a];
      
        for(int i=0;i<a;i++){x1[i] = sc.nextInt();
                             y1[i] = sc.nextInt();                             
                             ans[i] = 1;
                             }
        for(int i=0;i<e;i++){x2[i] = sc.nextInt();
                             y2[i] = sc.nextInt();                           
                            }
        for(int i=0;i<a;i++){int b = 0; Long c = Long.MAX_VALUE;
        for(int j=0;j<e;j++){Long d = c-c; 
                             d+=Math.abs(x1[i]-x2[j]);
                             d+=Math.abs(y1[i]-y2[j]);
                             if(d<c){b=j;c=d;}
                             if(j==e-1){ans[i]+=b;}        
                            } 
                            }        
        for(int i=0;i<a;i++){System.out.println(ans[i]);}		
	}
}
	
