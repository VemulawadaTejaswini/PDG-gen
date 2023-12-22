import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int dist = 0;
        int count = 0;
        for(int i = 0; i < S.length(); i++){
            if(S.charAt(i) == 'B'){
                count++;
                dist = dist + (S.length()-(i+1));
            }
        }
        int answer = dist - (count)*(count-1)/2;
        System.out.print(answer);
    }
}