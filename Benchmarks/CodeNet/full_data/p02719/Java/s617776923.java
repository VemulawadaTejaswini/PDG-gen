import java.util.*;
 
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
 
        int N = sc.nextInt();
        int K = sc.nextInt();
        int Z = N%K;
        System.out.println(Math.min(N, Z));

    }
}