import java.util.Scanner;

public class Atcodercontest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc= new Scanner(System.in);
		 int A = sc.nextInt();
		 int B = sc.nextInt();
		 int C = sc.nextInt();
		 int D = sc.nextInt();
		 int Train = 0;
		 int Bus = 0;
		 if(A>B) {
			 Train = Train + B;
		 }
		 else {
			 Train = Train + A;
		 }
		 if(C>D) {
			 Bus = Bus + D;
		 }
		 else {
			 Bus = Bus + C;
		 }
		 System.out.println(Train+Bus);
	}

}
