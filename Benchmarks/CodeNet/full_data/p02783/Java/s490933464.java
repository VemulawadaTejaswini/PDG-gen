import java.util.Scanner;

public class Main{

     public static void main(String []args){
 
		Scanner scan = new Scanner(System.in);
		String[] strArray = scan.nextLine().split(" ");

        int H = Integer.parseInt(strArray[0]);
        int A = Integer.parseInt(strArray[1]);
        int lastCount = 0;
        
        for (int i = 1; H > 0; i++) {
            H = H - A;
            lastCount = i;
        }

        System.out.println(lastCount);

     }
}
