import java.util.*;

public class main{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		String str=scan.next();
		String strb;
		for(int i=0;i<200000;i++){
			strb=str;
			str=str.replaceFirst("ST","");
			if(str.equals(strb)) break;
		}
		System.out.print(str.length());
	}


}