import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();
        int min = Integer.MAX_VALUE;
        int x;
        for(int i=0;i+2<s.length;i++){
            x = 100*(s[i]-'0')+10*(s[i+1]-'0')+s[i+2]-'0';
            min = Math.min(Math.abs(x-753),min);
        }
        System.out.println(min);
    }
}