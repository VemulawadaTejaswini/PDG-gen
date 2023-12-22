import java.util.Scanner;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.PriorityQueue;
class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        
        long n = stdIn.nextLong();

        long count = 0L;

        for(int i = 0;i < n;i++){
            count+=i;
        }
        
 
        System.out.println(count);

        
    }

}