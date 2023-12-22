import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
 
    String s = sc.next();
 String[]ss = s.split("");
 sc.close();
 int r = 0; int b =0;
 for(int i=0; i<n; i++) {
	 if(ss[i].equals("R")) {r++;}
	 else if(ss[i].equals("B")) {b++;}
 }


  if(r>b) {System.out.println("Yes");}
  else {System.out.println("No");}
 
    		}
}
