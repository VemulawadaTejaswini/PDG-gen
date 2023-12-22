import java.util.*;

class Main {
    public static void main(String[] args){
        Scanner S = new Scanner(System.in);

        int K = S.nextInt();
        int X = S.nextInt();

        if(K*500 >= X){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
