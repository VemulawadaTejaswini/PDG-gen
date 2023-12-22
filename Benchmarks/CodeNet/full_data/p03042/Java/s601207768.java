import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	   String s = sc.nextLine();
	   String []ss = s.split("");
	   StringBuilder sa = new StringBuilder();
	   StringBuilder sb = new StringBuilder();
	   sa.append(ss[0]); sa.append(ss[1]);
	   sb.append(ss[2]); sb.append(ss[3]);
	   String saa = sa.toString();  String sbb = sb.toString();
	   int a = Integer.parseInt(saa); int b = Integer.parseInt(sbb);
    if(a==4||a==6||a==9||a==11&&b>=31) {System.out.println("NA");}
    else if(b==4||b==6||b==9||b==11&&a>=31) {System.out.println("NA");}
    else if(a==2&&b>=30||b==2&&a>=30) {System.out.println("NA");}	
    	
    
	   else if(a>=1&&a<=12&&b>=13&&b<=31) {System.out.println("MMYY");}
	  else if(a>=13&&a<=31&&b>=1&&b<=12) {System.out.println("YYMM");}
	  else if(a>=1&&a<=12&&b>=1&&b<=12) {System.out.println("AMBIGUOUS");}
	  else  {System.out.println("NA");}
	
	}

}