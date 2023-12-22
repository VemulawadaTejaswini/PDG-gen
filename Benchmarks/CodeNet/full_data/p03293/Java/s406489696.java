import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String moto=sc.next();
		String answer=sc.next();

		boolean tadashii=false;
		for(int i=0; i<moto.length()-1; i++) {
			for(int j=0; j<moto.length(); j++) {
				if(answer.charAt(j)!=moto.charAt((i+j)%moto.length())){
					break;
				}
				if(j==moto.length()-1) {
					System.out.println("Yes");
					System.exit(0);
				}
			}
		}
		System.out.println("No");
	}
}