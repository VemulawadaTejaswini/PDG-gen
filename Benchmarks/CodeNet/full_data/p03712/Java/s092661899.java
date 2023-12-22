import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int H = scan.nextInt();
        int W = scan.nextInt();
        List<String> dat = new ArrayList<String>();
        for (int i = 0; i < H; i++)
        {
            dat.add(scan.next());
        }
        scan.close();
        for (int i = -1; i < H + 1; i++)
        {
            if (i == -1 || i == H)
                System.out.println(String.valueOf('#').repeat(W + 2));
            else
                System.out.println("#" + dat.get(i) + "#");
        }
    }
}
