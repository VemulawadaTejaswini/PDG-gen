import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k=sc.nextInt();
        for(int i=0; i<n; i++) k *= 100;
        System.out.println(k);
    }
}