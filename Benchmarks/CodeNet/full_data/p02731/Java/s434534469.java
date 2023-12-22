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
    double L;
    
    //入力
    Main(Scanner sc) {
        this.sc = sc;
        this.L = sc.nextDouble();
    }
    
    //解答処理
    private double solve() {
        double volume = Math.pow(L/3, 3);
        return volume;
    }
    
    //出力
    public void show(double answer) {
        System.out.printf("%.12f",answer);
    }

}