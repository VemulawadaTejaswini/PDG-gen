import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

     int max = Integer.MIN_VALUE;
     int min = Integer.MAX_VALUE;
     Scanner in = new Scanner(System.in);
     int N = in.nextInt();
     while(in.hasNext()){
         int cur = in.nextInt();
         max = Math.max(max,cur);
         min = Math.min(min,cur);
     }
        System.out.println(max-min);
    }
}