import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int A = s.nextInt();
        int B = s.nextInt();
        int ans = A + B;
        if (ans <24) {
            System.out.print(ans);
        }
        if (ans >24) {
            System.out.print(ans - 24);
        }
        if(ans==24){
            System.out.print(0);
        }
    }
}