import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        boolean[] list = new boolean[82];
        for (int i = 1; i <10 ; i++) {
            for (int j = 1; j < 10 ; j++) {
                list[i*j] = true;
            }
        }
        int N = sc.nextInt();
        if(N > 81){
            System.out.println("No");
            return;
        }else{
            if(list[N]){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }
}
