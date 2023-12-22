import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int cl = 0;
		int fcl = 0;
		String s = sc.next();
		for(int i = 0; i < s.length(); i ++){
			switch(s.charAt(i)){
			case 'a':
				if(cl < a + b){
					System.out.println("Yes");
					cl++;
				}else{
					System.out.println("No");
				}
				break;
			case 'b':
				if(cl < a + b && fcl < b){
					System.out.println("Yes");
					cl++;
					fcl ++;
				}else{
					System.out.println("No");
				}
				break;
			default:
				System.out.println("No");
				break;
			}
		}
	}
}


