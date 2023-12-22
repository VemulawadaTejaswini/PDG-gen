import java.util.Scanner;

class Main {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        int ans = 0;
        if(b < c)
            System.out.println(ans);
        if(b > c){
            ans = b - ( c + a );
            System.out.println(ans);
        }
    }
}
