import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int [] x1 = new int [a];
        int [] y1 = new int [a];
        int [] x2 = new int [a];
        int [] y2 = new int [a];
        int [] ans = new int [a];
      
        for(int i=0;i<a;i++){x1[i] = sc.nextInt();
                             y1[i] = sc.nextInt();
                            }
        for(int i=0;i<a;i++){x2[i] = sc.nextInt();
                             y2[i] = sc.nextInt();
                            }
        int b,c;
        Long d;
        for(int i=0;i<a;i++){b = 0; c = 1000000000;
        for(int j=0;j<a;j++){d = 0; 
                             d+=Math.abs(x1[i]-x2[j]);
                             d+=Math.abs(y1[i]-y2[j]);
                             if(d<c){b=j;c=d;}
                             if(j==a-1){ans[i]+=b+1;}        
                            } 
                            }        
        for(int i=0;i<a;i++){System.out.println(ans[i]);}		
	}
}

