import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int number[] = new int[3];
        for(int i = 0; i < 3; i++){
            number[i] = scan.nextInt();
        }

        Arrays.sort(number);

        int a = number[2] - number[0];
        int b = number[2] - number[1];

        if(a%2 == 0 && b%2 == 0){

            System.out.println((a/2)+(b/2));

        }else if(a%2 != 0 && b%2 == 0){

            System.out.println((a/2)+(b/2) + 2);

        }else if(a%2 == 0 && b%2 != 0){

            System.out.println((a/2)+(b/2) + 2);

        }else{

            System.out.println((a/2)+(b/2) + 1);
        }
    }
}