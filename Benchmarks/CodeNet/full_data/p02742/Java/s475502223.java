import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long h = scanner.nextLong();
        long w = scanner.nextLong();

        if (h==1 || w==1){
            System.out.println(1);
        }
        
        else if ((h*w)%2==0){
            System.out.println((h*w)/2);
        }
        else
            //((h*w)%2!=0)
            {
                System.out.println(((h*w)/2)+1);
            }
    }
}