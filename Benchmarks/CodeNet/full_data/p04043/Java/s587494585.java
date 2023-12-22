import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Main m = new Main(sc);
        m.show(m.solve());
        sc.close();
    }
    
	//フィールド
    Scanner sc;
    int[] list = new int[3];
    
    //入力
    Main(Scanner sc) {
        this.sc = sc;
        for (int i=0; i<3; i++) {
        	list[i] = sc.nextInt();
        }
    }
    
    //解答処理
    private String solve() {
        String answer = "NO";
        int count5 = 0;
        int count7 = 0;
        
        for (int i=0; i<3; i++) {
        	if (list[i] == 5) {
        		count5++;
        	} else if (list[i] == 7) {
        		count7++;
        	}
        }
        if (count5 == 2 && count7 == 1) {
        	answer = "YES";
        }
        
        return answer;
    }
    
    //出力
    public void show(String answer) {
        System.out.println(answer);
    }

}
