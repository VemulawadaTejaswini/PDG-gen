import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Main m = new Main(sc);
        m.show(m.solve());
    }
    
    Scanner sc;
    int H;
    int W;
    String[] a;
    
    //入力
    Main(Scanner sc) {
        this.sc = sc;
        H = sc.nextInt();
        W = sc.nextInt();
        a = new String[H];
        for (int i=0; i<H; i++){
            a[i] = sc.next();
        }
    }
    
    //解答処理
    ArrayList<ArrayList<String>> solve() {
        boolean[] result1 = new boolean[H];
        boolean[] result2 = new boolean[W];
        
        ArrayList<ArrayList<String>> answer = new ArrayList();
        
        for (int i=0; i<H; i++){
            for (int j=0; j<W; j++){
                if (a[i].charAt(j) == '#'){
                    result1[i] = true;
                    result2[j] = true;
                }
            }
        }
        
        for(int i=0; i<H; i++){
            ArrayList<String> answer2 = new ArrayList();
            if(result1[i] == false){
                continue;
            }
            for(int j=0; j<W; j++){
                if(result2[j] == false){
                    continue;
                }
                answer2.add(String.valueOf(a[i].charAt(j)));
            }
            answer.add(answer2);
        }
        
        return answer;
    }
    
    //出力
    void show(ArrayList<ArrayList<String>> answer) {
        for (int i=0; i<answer.size(); i++){
            for (int j=0; j<answer.size(); j++){
                System.out.print(answer.get(i).get(j));
            }
            System.out.println("");
        }
    }
}
