
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        double l=scanner.nextDouble();
        double ll=(double)3;
        double l1=(double)l/ll;
        double l2=(double)l/ll;
        double l3=(double)((double)l-(double)((double)l1+(double)l2));
        double ans=(double)((double)l1*(double)l2*(double)l3);
        System.out.println(ans);
    }
}
