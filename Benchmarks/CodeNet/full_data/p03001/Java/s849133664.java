import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int wide = Integer.parseInt(sc.next());
        int height = Integer.parseInt(sc.next());
        int w = Integer.parseInt(sc.next());
        int h = Integer.parseInt(sc.next());
        double res = wide*height/2;
        int i = 0;
        if (wide%2==1&&height%2==1&&wide+1==w*2&&w!=0&&h!=0&&h!=height) {
            i=1;
        }
        System.out.println(res+" "+i);
    }
}
