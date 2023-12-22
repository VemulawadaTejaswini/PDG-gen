import java.util.*;
public class Main {
    public static void main(String[] args){
        Main start=new Main();
        start.start();

    }
    public Main(){
    }
    public void start(){
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        int N = sc.nextInt();
        int K=sc.nextInt();
        System.out.println(N-K);
    }
}