import java.util.Scanner;

class Main{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), m = in.nextInt();
        int ans = m * 1900;
        ans += 100  * (n - m);
        System.out.println(ans * 2 * m);
    }
}