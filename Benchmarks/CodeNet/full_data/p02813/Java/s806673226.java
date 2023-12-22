import java.util.*;
public class Main {
	
    public static int fac(int n){
        if(n==0) return 1;
        return n*fac(n-1);
    }     
    public static void main(String[] args){        
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int [] in = new int [a];
        int [] in2 = new int [a];
        int b = 1;
        int c = 1;
        for(int i=0;i<a;i++){
                             in[i] = sc.nextInt();
                            }
        for(int i=0;i<a;i++){
                             in2[i] = sc.nextInt();
                            }
		for(int i=0;i<a-1;i++){b+=(in[i]-1)*fac(a-1-i);
        for(int j=i+1;j<a;j++){if(in[j]>in[i]){in[j]--;}                                                             
                            }                                                      
                            }  
        for(int i=0;i<a-1;i++){c+=(in2[i]-1)*fac(a-1-i);
        for(int j=i+1;j<a;j++){if(in2[j]>in2[i]){in2[j]--;}                                                             
                            }                                                      
                            }                                    
		System.out.println(Math.max(b-c,c-b));
	}
}
