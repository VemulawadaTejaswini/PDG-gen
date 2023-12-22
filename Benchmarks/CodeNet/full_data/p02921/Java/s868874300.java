import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		  Scanner  scan = new   Scanner (System.in);
		 String str1=scan.next();
		 String str2=scan.next();
		 char []c1=str1.toCharArray();
		 char[]c2=str2.toCharArray();
		 int count=0;
		 for(int i=0; i<c1.length;i++){
			 if(c1[i]==c2[i]){
				 count++;
			 }
		 }
		 System.out.println(count);
	}
}
