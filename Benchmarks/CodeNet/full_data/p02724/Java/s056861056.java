import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int m = N%500;
        System.out.println(N/500*1000+m/5*5);

    }
}