
import java.util.Scanner;

public class Main
{
    private final static Main main = new Main();

    public static void main(String[] args)
    {
        long l = System.currentTimeMillis();
        main.contest();
        //System.out.println("処理時間：" + (System.currentTimeMillis() - l));
    }

    private void contest()
    {
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();
        x = x.replaceAll("S+T+", "");
        System.out.println(x.length());
    }
}
