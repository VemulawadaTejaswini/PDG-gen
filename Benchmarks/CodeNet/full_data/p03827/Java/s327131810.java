
import java.util.Scanner;

public class Main {

    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();

        int max = 0;
        int cnt=0;

        for(int i=0;i<str.length();i++){
            char current = str.charAt(i);
            if(current=='I') {
                cnt++;
                max = Math.max(max,cnt);
            }
            else cnt--;
        }

        System.out.print(max);

        sc.close();
    }

}