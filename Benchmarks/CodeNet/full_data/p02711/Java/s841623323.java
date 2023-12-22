import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String tmp = String.value(N);
        boolean flg = false;

        for(int i = 0; i < 3; i++) {
            if(tmp.charAt(i) == '7') {
                flg = true;
            }
        }
        if(flg == true)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
