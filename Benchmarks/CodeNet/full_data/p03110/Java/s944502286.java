import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        int answer = 0;

        for (int i = 0; i < cnt; i++) {
            int amount =sc.nextInt();
            String type = sc.next();
            if(type =="JPY") answer += amount;
            else answer += amount * 380000;
        }

        System.out.println(answer);
    }
}