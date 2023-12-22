import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int answer;
        if(n<105){
            answer = 0;
        }
        else if(n<135){
            answer = 1;
        }
        else if(n<165){
            answer = 2;
        }
        else if(n<195){
            answer = 3;
        }
        else{
            answer = 4;
        }
        System.out.println(answer);
    }
}