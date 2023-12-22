import java.util.*;

/*
説明
*/
public class Main {
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        
        double ans = n * n * n;

        // ans = ans * ans * ans;
        // if (!first.equals(saigo)) {
        //     ans = "No";
        // }
        System.out.println(String.format("%.12f", ans/27));
    }
}