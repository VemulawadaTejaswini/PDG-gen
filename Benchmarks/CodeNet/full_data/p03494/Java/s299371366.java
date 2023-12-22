import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("数は何個ですか");
        int n = scan.nextInt();
        int[] N = new int[n];
        int count = 0;
        boolean check = true;

        for(int i = 0 ; i < n ; i++){
        	System.out.println("入力して下さい");
           N[i] = scan.nextInt();
           System.out.println(N[i]);
        }

        while(check){

        for(int t : N ){
           if(t % 2 == 1){
             check = false;
             count --;
             break;
           }
        }
        for(int i = 0 ; i < n ; i++) {
        	N[i] /= 2;
        }
        count ++;
        }
      System.out.println(count);
    }

}