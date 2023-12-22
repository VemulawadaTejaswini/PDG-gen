import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),k=sc.nextInt();
        while(n>k){
            n = n/k;
        }
        if(n%k == 0){
            System.out.println(0);
        }else{
            System.out.println(1);
        }
    }
}