
import java.util.Scanner;



public class Main {

	public static int k=0;

	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
//        int amount = sc.nextInt();
        int num = sc.nextInt();

        num= num+1;



        while(num >= 10){

        	k+=9;
        	num = num /10;

        }

        k = k + num -1;

        System.out.println(k);





    }



}


