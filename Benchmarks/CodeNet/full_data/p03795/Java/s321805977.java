import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int ans = 800*N-200*(N/15);
        System.out.println(ans);

    }
}
