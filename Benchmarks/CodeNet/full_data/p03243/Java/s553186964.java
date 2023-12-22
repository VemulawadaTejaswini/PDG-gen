import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int contestNumber = sc.nextInt();
        int mod = contestNumber % 111;
        if(mod == 0){
            System.out.println(contestNumber);
            return ;
        }
        int n = contestNumber / 111;
        System.out.println(111 * (n + 1));
    }
}
