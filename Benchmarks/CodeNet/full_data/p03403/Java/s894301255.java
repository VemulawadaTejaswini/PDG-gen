import java.util.Scanner;

/**
 * Created by ko-sasaki on 2018/03/25.
 *
 * @author ko-sasaki
 */
public class Main {
    private int row;
    private int[] spots;

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
        for(int i = 1; i <= this.row ; i++){
            this.calcPath(i);
        }
    }

    private void calcPath(int ignorePathNumber){

        int before = 0;
        int after = 0;
        int calc = 0;
        for(int i = 1 ; i < this.spots.length;i++){
            if(i == ignorePathNumber){
                continue;
            }
            after = this.spots[i];
            calc += Math.abs(after - before);
            before = after ;
        }

        calc += Math.abs(spots[this.row+1] - before);
        System.out.println(calc);

    }

}
