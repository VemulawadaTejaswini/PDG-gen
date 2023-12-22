import java.util.*;

public class Main{
    void solve(){
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        if(s.equals("Sunny")) System.out.println("Cloudy");
        else if(s.equals("Cloudy")) System.out.println("Rainy");
        else System.out.println("Sunny");
    }

    public static void main(String[] args){
        new Main().solve();
    }
}
