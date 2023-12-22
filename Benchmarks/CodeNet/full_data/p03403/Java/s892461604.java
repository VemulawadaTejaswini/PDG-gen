import java.util.Scanner;

/**
 * Created by ko-sasaki on 2018/03/25.
 *
 * @author ko-sasaki
 */
public class Main {
    private int row;
    private int[] spots;
    private int allRouteCost;

    public Main(Scanner s) {
        this.row = s.nextInt();
        this.spots = new int[this.row + 2];
        this.spots[0] = 0; //最初
        this.spots[this.row + 1] = 0; //最後
        for(int i = 1 ; i < this.row; i++){
            this.spots[i] = s.nextInt();
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Main main = new Main(s);
        main.exec();
    }

    private void exec(){

        for(int i = 0; i <= this.row ; i++){
            this.allRouteCost += Math.abs(this.spots[i] - this.spots[i+1]);
        }

        for(int i = 1; i <= this.row ; i++){
            int result;
            result = this.allRouteCost - Math.abs(this.spots[i-1] - this.spots[i]);
            result -= Math.abs(this.spots[i] - this.spots[i+1]);
            result += Math.abs(this.spots[i-1] - this.spots[i+1]);
            System.out.println(result);
        }
    }
}