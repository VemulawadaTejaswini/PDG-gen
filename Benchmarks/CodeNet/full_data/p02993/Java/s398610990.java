import java.util.Scanner;

public class Main{

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        // input
        char[] input = scan.next().toCharArray();

        // search
        String answer = "Good";
        char temp = input[0];
        for(int i = 1; i < 4; i++){
            if(temp == input[i]){
                answer = "Bad";
                break;
            } else {
                temp = input[i];
            }
        }

        // answer
        System.out.println(answer);

    }
}