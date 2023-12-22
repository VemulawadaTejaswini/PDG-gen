import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		String str=scan.next();
		String strb;
		for(int i=0;i<200000;i++){
			strb=str;
			str=str.replaceAll("ST","");
			if(str.equals(strb)) break;
		}
		System.out.print(str.length());
	}


}