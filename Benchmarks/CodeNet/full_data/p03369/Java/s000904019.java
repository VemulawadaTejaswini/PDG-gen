import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Main m = new Main(sc);
        m.show(m.solve());
    }
    
    Scanner sc;
    String S;
    
    //入力
    Main(Scanner sc) {
        this.sc = sc;
        S = sc.next();
    }
    
    //解答処理
    int solve() {
        int price = 700;
        
        for (int i=0; i<S.length(); i++){
            if (S.charAt(i) == 'o'){
                price += 100;
            }
        }
        return price;
    }
    
    //出力
    void show(int answer) {
        System.out.println(answer);
    }
}
