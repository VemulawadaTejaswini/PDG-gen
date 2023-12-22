import java.util.Scanner;

class b {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
		int B = scan.nextInt();
		scan.close();
        int lg = A+B;
        lg = A-B>lg? A-B : lg;
        lg = A*B>lg? A*B : lg;
        System.out.println(lg); 
    }
}