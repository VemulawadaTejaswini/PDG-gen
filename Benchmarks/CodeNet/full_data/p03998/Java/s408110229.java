import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner scn = new Scanner(System.in);
		String s1 = scn.next();
      	String s2 = scn.next();
      	String s3 = scn.next();
      	String[] a = s1.split("");
      	String[] b = s2.split("");
      	String[] c = s3.split("");
      	int aa = s1.length();
      	int bb = s2.length();
      	int cc = s3.length();
      	String next = "a";
      	while(true){
          if(next.equals("a")){
            if(aa==0){
            	System.out.println("A");
				return;
            }
            next = a[s1.length()-aa];
					aa--;
          }
          if(next.equals("b")){
            if(bb==0){
            	System.out.println("B");
				return;
            }
            next = b[s2.length()-bb];
					bb--;
          }
          if(next.equals("c")){
            if(cc==0){
            	System.out.println("C");
				return;
            }
            next = c[s3.length()-cc];
					cc--;
          }
        }
	}
}
