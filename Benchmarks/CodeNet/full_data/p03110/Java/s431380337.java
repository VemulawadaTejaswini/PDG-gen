import java.util.*;
public class Main {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
      double po=0;
      for(int i=0;i<a;i++){
         String b=sc.next();
        String c=sc.next();
        if(c.equals("BTC"))po+=Double.parseDouble(b);
        else po+=Integer.parseInt(b);
      }
		System.out.println(po);
	}
}
