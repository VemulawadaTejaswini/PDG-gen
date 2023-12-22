import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scannser(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int k = sc.nextInt();

        for(int i = 0; i < k; i++){
            if(a >= 1){
                a--;
            }
            else if(b >= 1){
                b--;
            }
        }

        System.out.print(a + " ");
        System.out.println(b);
    }
}
