import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        int a = kbd.nextInt();
        int b = kbd.nextInt();
        if(a>=13){
            System.out.println(b);
        }else if(a<=5){
            System.out.println(0);
        }else{
            System.out.println(b/2);
        }
    }
}