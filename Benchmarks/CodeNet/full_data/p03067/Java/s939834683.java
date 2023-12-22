import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        int a = kbd.nextInt();
        int b = kbd.nextInt();
        int c = kbd.nextInt();

        if(a<c && c<b){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}