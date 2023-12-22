import java.util.Scanner;

class Main{
    public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int iin = sc.nextInt();
		int iia = sc.nextInt();
		int iib = sc.nextInt();
		if(iin*iia<iib) {
			System.out.println(iin*iia);

		}
		else {
			System.out.println(iib);
		}
    }
}
