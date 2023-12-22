import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        String s = stdIn.next();
        char[] cs = s.toCharArray();
        int n = cs.length;

        for(int i=0; i<n/2; i++){
            if(cs[i] != cs[n-i-1]){
                System.out.println("No");
                return;
            }
        }

        for(int i=0; i<(n-1)/4; i++){
            if(cs[i] != cs[(n-1)/2-i-1]){
                System.out.println("No");
                return;
            }
        }

        for(int i=0; i<(n-1)/4; i++){
            if(cs[n-i-1] != cs[n-(n-1)/2+i]){
                System.out.println("No");
                return;
            }
        }

        System.out.println("Yes");
    }
}