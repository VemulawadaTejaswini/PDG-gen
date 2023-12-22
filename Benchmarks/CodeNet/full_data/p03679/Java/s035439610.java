import java.util.Scanner;

public class Main {
    static Scanner in  = new Scanner(System.in);
    public static void main(String[] args){
        int x = in.nextInt(), a = in.nextInt(), b = in.nextInt();
        if(a >= b){
            System.out.println("delicious");
        }else{
            if(b - a >= x + 1){
                System.out.println("dangerous");
            }else{
                System.out.println("safe");
            }
        }
    }
}
