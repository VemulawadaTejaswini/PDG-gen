import java.util.Scanner;

public class Main{

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        // input
        char[] before = scan.next().toCharArray();
        char[] after = scan.next().toCharArray();

        // search
        int answer = 0;
        for(int i = 0; i < 3; i++){
            if(before[i] == after[i]){
                answer++;
            }
        }

        // answer
        System.out.println(answer);

    }
}