import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int r = sc.nextInt();
        double minValue = -1;
        double v;
        int i,j;

//        System.out.println(l + " : " + r);

        i=0;j=0;
        for(i=l;i<r;i++) {
            for(j=i+1;j<=r;j++) {
                v = ((double)l*(double)j)%2019;

//                System.out.println("[" + i + ", " + j + "] " + v);
                if ((minValue == -1) || (minValue > v)) {
                    minValue = v;
                    if (minValue == 0) { break; }
                }

            }
            if (minValue == 0) { break; }
        }
//        System.out.println("[" + i + ", " + j + "]");
        // 出力
        System.out.println((int)minValue);
}