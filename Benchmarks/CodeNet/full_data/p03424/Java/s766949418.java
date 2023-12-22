import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String arare[]=new String[100];
		for(int i=0;i<n;i++) {
			arare[i]=sc.next();
			System.out.println(arare[i]);
			if(arare[i].equals("Y")) {
				System.out.println("Four");
				break;
			}else if(i==n-1){
				System.out.println("Three");
				break;
			}
		}
	}

}