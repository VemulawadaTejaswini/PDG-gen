import java.util.Scanner;
public class Go_home {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        int x = Integer.parseInt(read.nextLine());
        int c = 0;
        int sum = 0;
        while (sum < x){
            c++;
            sum += c;
        }

                System.out.println(c);

    }
}