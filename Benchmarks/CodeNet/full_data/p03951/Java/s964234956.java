
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String prefix = sc.next();
        String postfix = sc.next();

        int answser = 0;
        if(N>=prefix.length()+postfix.length()) {
            answser = N;
        }
        else{
            if(prefix.contains(postfix)||postfix.contains(prefix)){
                answser = Math.max(prefix.length(),postfix.length());
                if(answser<N) answser = N;
            }
            else {
                answser = prefix.length() + postfix.length();
                for (int i = 0; i < prefix.length() && i < postfix.length(); i++) {
                    if (prefix.charAt(prefix.length() - i - 1) == postfix.charAt(i)) {
                        answser--;
                    } else {
                        break;
                    }

                    if (answser == N) {
                        break;
                    }
                }
            }
        }

        System.out.println(answser);
        sc.close();

    }

 }
