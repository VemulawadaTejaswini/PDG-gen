import java.util.Scanner;

public class Grouping2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int groups = 0;
        while (N > 2){
            if (N-3 < 3){
                groups += 1;
                N = 0;
            }else{
                groups += 1;
                N -= 3;
            }
        }

        System.out.println(groups);
    }
}