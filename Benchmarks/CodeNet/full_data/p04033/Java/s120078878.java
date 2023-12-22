import java.util.*;
public class Main {
    static void solve(){
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt(), end = sc.nextInt();
        if(start>0&&end>0) System.out.println("Positive");
        else if (start<=0&&end>=0) System.out.println("Zero");
        else 
        System.out.println((end-start)%2==0 ? "Negative" : "Positive");
        sc.close();
    }

    public static void main(String args[]) {
        solve();
    }
}   
