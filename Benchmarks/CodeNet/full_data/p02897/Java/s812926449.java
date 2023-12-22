import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        double oddCount = Math.round(n/2);
        
        System.out.println(oddCount/n);
    }
}