
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		 String result = ""+num;
		 int length = result.length();
		 int add=0;
		 int keta;
		 int mod=0;
		 int i =0;
		 for(; i<length; i++){			 
			 keta = Integer.parseInt((result.charAt(length-(i+1)))+"");
			 add = add+keta;
		 }
		 
		 mod = num%add;
		 String kekka;
		 if(mod==0){
			 kekka="Yes";
			 		 }else{
			  kekka="No"; 
		 }
		 System.out.println(kekka);

				

	}
}