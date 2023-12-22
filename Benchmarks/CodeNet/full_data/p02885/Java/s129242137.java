import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        int hoge = sc.nextInt();
        int hoge2 = sc.nextInt();

        if(hoge > 2 * hoge2){
            System.out.println(hoge-2*hoge2);
        }else{
            System.out.println(0);
        }   
    }   
}