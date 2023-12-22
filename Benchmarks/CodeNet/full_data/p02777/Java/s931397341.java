import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String r = sc.next();
		String b = sc.nextLine();
		int rn = sc.nextInt();
		int bn = sc.nextInt();
		sc.nextLine();
		String u = sc.nextLine();

		if(r.equals(u)){
			System.out.println(rn-1+" "+bn);
		}else{
			bn--;
			System.out.println(rn+" "+bn);
		}
		}
}