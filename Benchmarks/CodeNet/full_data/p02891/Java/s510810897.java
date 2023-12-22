import java.util.*;

public class Main{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

		String s = sc.next();
		long k = sc.nextLong();

        long answer = 0;
        long count = 1;
        for(int i = 1; i < s.length(); i++){
            if(s.charAt(i) == s.charAt(i - 1)) count++;
            else if(count != 0){
                answer += count / 2 * k;
                count = 1;
            }
        }

        if(s.charAt(0) == s.charAt(s.length() - 1)) answer += k;

        System.out.println(answer);

    }

}
