import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        while(input.hasNext()){
            int D = input.nextInt();
            int N = input.nextInt();
           
            System.out.println(D);
            for(int i = 0; i < N; ++i){
                 System.out.println("00");
            }
        }
    }
}