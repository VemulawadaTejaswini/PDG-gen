import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
        int a = sc.nextInt();
        int b = 1;
        String t;
        int d,e;
        StringBuffer sb = new StringBuffer(s);
        StringBuilder sb2;
        for(int i=0;i<a;i++){d = sc.nextInt();
                             if(d==1){b*=-1;
                                     }
                             else{e = sc.nextInt(); 
                                  t = sc.next();
                                  sb2 = new StringBuilder();
                                 if(b==1){if(e==1){
                                          sb2.append(t);
                                          sb2.append(s);                                          
                                 }
                                 else{sb2.append(s);
                                     sb2.append(t);
                                     }
                                         }
                                  else{if(e==1){
                                          sb2.append(s);
                                          sb2.append(t);                                          
                                 }
                                 else{sb2.append(t);
                                     sb2.append(s);
                                     }
                                      }
                                s = sb2.toString(); }
                            }
        if(b==-1){ sb.reverse(); 
                   s = sb.toString();}
		System.out.println(s);
	}
}
