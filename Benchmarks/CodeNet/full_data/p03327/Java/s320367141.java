import java.util.Scanner;

public class Main{
    public static void Main(String[] args){
        Scanner input = new Scanner(System.in);
        
        while(input.hasNext()){
             int round = input.nextInt();

             if(round > 999){
                 System.out.println("ABC");
             } else {
                 System.out.println("ABD");
             }
        }
    }
}