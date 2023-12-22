import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < 3; i++){
            System.out.print(s.next().charAt(i));
        }
    }
}
