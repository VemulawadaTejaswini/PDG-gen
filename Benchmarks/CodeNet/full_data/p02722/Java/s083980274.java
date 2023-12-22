import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong()-1;		
        long b = 1;
        long c = 0;
        for(long i=1;i<=Math.sqrt(a);i++){if(a%i==0){c+=2;}if(i==Math.sqrt(a)){c--;}
                                         }
        a++; 
        long e,f,g;
        for(long i=1;i<=Math.sqrt(a);i++){if(a%i==0)
          if(i<Math.sqrt(a)){g=a;e=i;f=a/i;
                                                                     
                             while(g%e==0){g/=e;}
                                                                     
                             if(g%e==1){c++;}
                                                                     
                             g=a;
                             while(g%f==0){g/=f;}
                                                                     
                             if(g%f==1){c++;}
                                                                     
                            }
                                                       
                                          else{c++;}
                                         }
        System.out.println(c);                                  
	}
}
