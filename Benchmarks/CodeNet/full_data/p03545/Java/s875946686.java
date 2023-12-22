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
    String solve() {
        String[] s = S.split("");
        int A = Integer.parseInt(s[0]);
        int B = Integer.parseInt(s[1]);
        int C = Integer.parseInt(s[2]);
        int D = Integer.parseInt(s[3]);
        
        String op1 = null;
        String op2 = null;
        String op3 = null;
        
        if (A+B+C+D == 7){
            op1 = "+"; op2 = "+"; op3 = "+";
        } else if (A-B+C+D == 7){
            op1 = "-"; op2 = "+"; op3 = "+";
        } else if (A+B-C+D == 7){
            op1 = "+"; op2 = "-"; op3 = "+";
        } else if (A+B+C-D == 7){
            op1 = "+"; op2 = "+"; op3 = "-";
        } else if (A-B+C-D == 7){
            op1 = "-"; op2 = "+"; op3 = "-";
        } else if (A+B-C-D == 7){
            op1 = "+"; op2 = "-"; op3 = "-";
        } else if (A-B-C+D == 7){
            op1 = "-"; op2 = "-"; op3 = "+";
        } else if (A-B-C-D == 7){
            op1 = "-"; op2 = "-"; op3 = "-";
        }
        
        
        String f = A + op1 + B + op2 + C + op3 + D + "=7";
        return f;
    }
    
    //出力
    void show(String answer) {
        System.out.println(answer);
    }
}
