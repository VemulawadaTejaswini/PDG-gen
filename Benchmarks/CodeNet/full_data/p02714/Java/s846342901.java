import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		String s = sc.next();
        int ans = 0;
        int r = 0;
        int g = 0;
        int b = 0;
        for(int i=0;i<a;i++){if(s.charAt(i)=='R'){r++;}
                             if(s.charAt(i)=='G'){g++;}
                             if(s.charAt(i)=='B'){b++;}
                            }
        int dr = r;
        int dg = g;
        int db = b;
        if(a>3){for(int i=0;i<a-3;i++){if(s.charAt(i)=='R'){r--;}if(s.charAt(i)=='G'){g--;}if(s.charAt(i)=='B'){b--;}
                                       dr = r;dg = g; db = b;
               for(int j=i+1;j<a-1;j++){if(s.charAt(i)=='R'){
                 if(s.charAt(j)=='G'){ans+=db;if(2*j-i<a && s.charAt(2*j-i)=='B'){ans--;}dg--;}
               if(s.charAt(j)=='B'){ans+=dg;if(2*j-i<a && s.charAt(2*j-i)=='G'){ans--;}db--;}
               if(s.charAt(j)=='R'){dr--;}                                             
                                                            }
                                        if(s.charAt(i)=='G'){
                 if(s.charAt(j)=='R'){ans+=db;if(2*j-i<a && s.charAt(2*j-i)=='B'){ans--;}dr--;}
               if(s.charAt(j)=='B'){ans+=dr;if(2*j-i<a && s.charAt(2*j-i)=='R'){ans--;}db--;}
               if(s.charAt(j)=='G'){dg--;}                           
                                                            } 
                              
                                       if(s.charAt(i)=='B'){
                 if(s.charAt(j)=='G'){ans+=dr;if(2*j-i<a && s.charAt(2*j-i)=='R'){ans--;}dg--;}
               if(s.charAt(j)=='R'){ans+=dg;if(2*j-i<a && s.charAt(2*j-i)=='G'){ans--;}dr--;}
               if(s.charAt(j)=='B'){db--;}                                                    
                                                           } 
                                       }                               
                                      }                           
              }
       
		System.out.println(ans);
	}
}
