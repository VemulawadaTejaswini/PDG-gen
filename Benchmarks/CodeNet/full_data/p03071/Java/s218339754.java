import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	   String s = sc.nextLine(); 
	   String[] ss = s.split("");
	  sc.close();
	int n = s.length();
	
	 int z = ct(n,zero(n,s),ss);
	int o = ct(n,one(n,s),ss);
   int ans = Math.min(z,o);
	

	
	System.out.println(ans);
	 

	}
  static String[] zero(int n,String s) {
	StringBuilder aa = new StringBuilder();

		for(int i=0; i<n; i++) {
			if(i%2==0) {aa.append("0");}
			if(i%2==1) {aa.append("1");}
		}
		
	
	 String aaa = aa.toString();  
	String[]a =aaa.split("");
	 return a;
 }
 
 static String[] one(int n,String s) {
		
		StringBuilder bb = new StringBuilder();

		for(int i=0; i<n; i++) {
				if(i%2==0) {bb.append("1");}
				if(i%2==1) {bb.append("0");}
			}
		
		  String bbb = bb.toString();
		  String[]b =bbb.split("");
		 return b;
	 }
 static int ct (int n,String[]a,String[]ss) {
	 int c =0;
	 for(int i=0; i<n; i++) {
		 if(a[i].equals(ss[i])) {
		    c++;
		 }
	 }
	 
	 return c;
 }


}