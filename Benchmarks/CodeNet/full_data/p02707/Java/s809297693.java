
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();

        String[] input = line.split(" ", 0);

        int all = Integer.valueOf(input[0]).intValue();

        line = sc.nextLine();
        input = line.split(" ", 0);

        int a = 1;
        int b = 0;
        int c = 0;
        for(int x = 0; x<all-1; x++){
            if( Integer.valueOf(input[x]).intValue() == a){
                b++;
            }else{
                System.out.println(b);
                a++;
                b = 1;
                c++;
            }
        }
        System.out.println(b);
        c++;

        while(c != all){
            System.out.println(0);
            c++;
        }
    }
}

