import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
        int a = sc.nextInt();
		String [] str = new String [a+1];
        str[0] = s;
        String t;
        int d,e;
        StringBuffer sb;
        StringBuilder sb2;
        for(int i=0;i<a;i++){d = sc.nextInt();
                             if(d==1){sb = new StringBuffer(str[i]);
                                      sb.reverse(); 
                                      str[i+1] = sb.toString(); }
                             else{e = sc.nextInt(); 
                                  t = sc.next();
                                  sb2 = new StringBuilder();
                                 if(e==1){sb2.append(t);  
                                          sb2.append(str[i]);}
                                 else{sb2.append(str[i]);
                                      sb2.append(t);}
                                 str[i+1] = sb2.toString();}
                            }      
		System.out.println(str[a]);
	}
}
