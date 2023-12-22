import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double yen[];
        yen = new double[n];
        String str[];
        str = new String[n];
        int a = 0;
        double add = 0;
        while(n > a){
            yen[a] = sc.nextDouble();
            str[a] = sc.next();
            if(str[a] == "BTC"){
                yen[a] = yen[a] * 380000.0;
                System.out.printf("a");
            }
            add = add + yen[a];
            a++;
        }
        System.out.println(add);
    }
}