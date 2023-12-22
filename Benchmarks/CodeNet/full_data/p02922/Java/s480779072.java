import java.util.Scanner;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.PriorityQueue;
class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        
        int a = stdIn.nextInt();
        int b = stdIn.nextInt();

        for(int i = 0;i < 20; i++) {
            if((1+i*(a-1) >= b)){
                System.out.println(i);
                break;
            }
        }



        
    }

}