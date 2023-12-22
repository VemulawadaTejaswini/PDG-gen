import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
      
		String s=sc.next();
		
		 int m = Integer.parseInt(s.substring(5,7));
	        if(m<=4){
	            System.out.println("Heisei");
	        }else{
	            System.out.println("TBD");
	        }
	}
}