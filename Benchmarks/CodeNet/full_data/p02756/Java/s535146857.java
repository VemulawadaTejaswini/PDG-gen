import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
        int a = sc.nextInt();
        int b = 1;
        String t;
        int d,e;
        for(int i=0;i<a;i++){d = sc.nextInt();
                             if(d==1){b*=-1;
                                     }
                             else{e = sc.nextInt(); 
                                  t = sc.next();
                                  if(b==1){if(e==1){
                                          t+=s;
                                          s=t;                                          
                                 }
                                 else{s+=t;
                                     }
                                         }
                                  else{if(e==1){
                                    s+=t; 
                                  }
                                 else{ t+=s;
                                       s=t;  
                                     }
                                      }
                                s = sb2.toString(); }
                            }
         StringBuffer sb = new StringBuffer(s);
         if(b==-1){sb.reverse(); 
                   s = sb.toString();}
		System.out.println(s);
	}
}
