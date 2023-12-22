import java.util.Scanner;

public final class Main{
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        int n = stdIn.nextInt();
        String s = stdIn.next();
        int k = stdIn.nextInt();

        char[] ca = s.toCharArray();

        for(int i=0; i<n; i++){
            if(ca[i] != ca[k-1]){
                ca[i] = '*';
            }
        }

        String ans = "";

        for(int i=0; i<n; i++){
            ans = ans + ca[i];
        }

        System.out.println(ans);
    }
}
