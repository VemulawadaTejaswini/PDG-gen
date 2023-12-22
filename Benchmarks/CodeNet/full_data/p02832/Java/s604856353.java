import java.util.*;

public class Main{
    void solve(){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        List<Integer> a = new ArrayList<>();
        for(int i = 0; i < n; i++) a.add(scan.nextInt());
        for(int i = 0; i < a.size(); i++){
            if(a.get(i) != i + 1){
                a.remove(i);
                i = -1;
            }
        }
        System.out.println(a.isEmpty() ? -1 : n - a.size());
    }

    public static void main(String[] args){
        new Main().solve();
    }
}
