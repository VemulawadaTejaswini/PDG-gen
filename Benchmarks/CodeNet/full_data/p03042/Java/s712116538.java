import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		boolean kk=false;
		boolean uu=false;
		if(s.charAt(0)=='0'){
			if(s.charAt(1)-'0'>=1 && s.charAt(1)-'0'<=9){
				kk=true;
			}
		}
		if(s.charAt(0)=='1'){
			if(s.charAt(1)-'0'<=2 && s.charAt(1)-'0'>=0){
				kk=true;
			}
		}
		if(s.charAt(2)=='0'){
			if(s.charAt(3)-'0'>=1 && s.charAt(3)-'0'<=9){
				uu=true;
			}
		}
		if(s.charAt(2)=='1'){
			if(s.charAt(3)-'0'<=2 && s.charAt(3)-'0'>=0){
				uu=true;
			}
		}
		if(kk && uu){
			System.out.println("AMBIGUOUS");
		}else if(kk){
			System.out.println("MMYY");
		}else if(uu){
			System.out.println("YYMM");
		}else{
			System.out.println("NA");
		}
	}
}
