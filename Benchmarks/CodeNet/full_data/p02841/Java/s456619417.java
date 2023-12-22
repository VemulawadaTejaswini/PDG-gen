import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
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
    int M1;
    int D1;
    int M2;
    int D2;
    
    //入力
    Main(Scanner sc) {
        this.sc = sc;
        this.M1 = sc.nextInt();
        this.D1 = sc.nextInt();
        this.M2 = sc.nextInt();
        this.D2 = sc.nextInt();
    }
    
    //解答処理
    private boolean solve() {
        boolean judge = false;
        
        LocalDate date = LocalDate.of(2019, M1, D1);
        //LocalDate date2 = LocalDate.of(2019, M2, D2);
        LocalDate date3 = date.with(TemporalAdjusters.lastDayOfMonth());
        
        if (date == date3) {
        	judge = true;
        }
        
        return judge;
    }
    
    //出力
    public void show(boolean answer) {
        if (answer) {
        	System.out.println(1);
        } else {
        	System.out.println(0);
        }
    }

}
