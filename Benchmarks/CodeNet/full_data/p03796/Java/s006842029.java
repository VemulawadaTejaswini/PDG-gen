import java.util.*;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long p = 1;
        for (int i = 0;i < n; i++){
            p = p*(i+1);
        }
        System.out.println(p % 1000000007);
    }     
}