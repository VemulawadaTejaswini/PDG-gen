import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	   String s = sc.nextLine();
	   sc.close();
	   String []ss = s.split("");
	   StringBuilder sa = new StringBuilder();
	   StringBuilder sb = new StringBuilder();
	   sa.append(ss[0]); sa.append(ss[1]);
	   sb.append(ss[2]); sb.append(ss[3]);
	   String saa = sa.toString();  String sbb = sb.toString();
	   int a = Integer.parseInt(saa); int b = Integer.parseInt(sbb);
  	
    	
    if(a>=1&&a<=12&&b==0) {System.out.println("MMYY"); }
    else if(b>=1&&b<=12&&a==0) {System.out.println("MMYY"); }
    else if(a>=1&&a<=12&&b>=1&&b<=12) {System.out.println("AMBIGUOUS");}
    else if(a>=1&&a<=12&&b>=0&&b<=99) {System.out.println("MMYY");}
	  else if(a>=0&&a<=99&&b>=1&&b<=12) {System.out.println("YYMM");}
	 
	  else  {System.out.println("NA");}
	
	}

}
