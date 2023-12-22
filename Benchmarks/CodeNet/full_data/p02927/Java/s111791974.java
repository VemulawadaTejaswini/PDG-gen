import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        final int M = scan.nextInt();
        final int D = scan.nextInt();
        scan.close();
        int result = 0;
        int day = 0;
        int month = 1;
        while(month <= M){
           if(day % 10 >= 2 && day / 10 >= 2 && 
           ((day % 10) * (day / 10) == month)){
               result++;
           }
           day++;
           if(day > D){
               day = 22;
               month++;
           }
        }
        System.out.println(result);
    }
}