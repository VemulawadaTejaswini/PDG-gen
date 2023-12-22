import java.util.Scanner;

/**
 * A - Circle
 */
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner( System.in );
        // 半径
        int r = sc.nextInt();
        // 入力された半径の円の面積
        double radiusArea = r * r * Math.PI;
        // 半径1の円の面積
        double area1 = 1 * 1 * Math.PI;

        System.out.println( String.format( "%.0f", radiusArea / area1 ) );

        sc.close();
    }
}