import java.util.*;

public class Main{
    void solve(){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        ArrayList<Character> s = new ArrayList<>();
        for(int i = 0; i < n; i++){
            char c = scan.next().charAt(0);
            if(!s.contains(c)) s.add(c);
        }
        System.out.println(s.size() == 3 ? "Three" : "Four");
        scan.close();
    }

    public static void main(String[] args){
        new Main().solve();
    }
}
