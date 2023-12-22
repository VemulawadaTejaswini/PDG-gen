import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class Main {
    private static int MOD = 1000000007;


    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String str = br.readLine();
        String[] split = str.split(" ");
        int x = Integer.parseInt(split[0]);
        int y = Integer.parseInt(split[1]);
        int a = Integer.parseInt(split[2]);
        int b = Integer.parseInt(split[3]);
        int c = Integer.parseInt(split[4]);

        String[] reds = br.readLine().split(" ");
        String[] greens = br.readLine().split(" ");
        String[] opa = br.readLine().split(" ");

        List<Integer> rs = new ArrayList<>();
        for (String red : reds) {
            rs.add(Integer.parseInt(red));
        }
        List<Integer> gs = new ArrayList<>();
        for (String green : greens) {
            gs.add(Integer.parseInt(green));
        }

        List<Integer> os = new ArrayList<>();
        for (String op : opa) {
            os.add(Integer.parseInt(op));
        }

        rs.sort(Comparator.reverseOrder());
        gs.sort(Comparator.reverseOrder());
        os.sort(Comparator.reverseOrder());

        int oi = 0;
        int xi = 0;
        int yi = 0;
        int sum = 0;
        while (true) {
            Integer red = 0;
            int redi = x - 1 - xi; // 少ない順
            if (redi > -1) {
                red = rs.get(redi);
            }
            Integer green = 0;
            int grei = y - 1 - yi; // 少ない順
            if (grei > -1) {
                green = gs.get(grei);
            }

            Integer o = 0;
            if (oi < os.size()) {
                o = os.get(oi);
            }

            if (redi <= -1 && grei <= -1) {
                break;
            }

            if (red != 0 && red < green) { //あかりんごが塗色対象の場合
                sum += green;
                yi++;
//                System.out.println("1:green:" + green);
                if (red < o) {
                    sum += o;
                    oi++;
                    xi++;
//                    System.out.println("opa as red:" + o);
                } else {
                    sum += red;
                    xi++;
//                    System.out.println("2:red: " + red);
                }
            } else {
                sum += red;
                xi++;
//                System.out.println("1:red: " + red);
//                System.out.println("o:" + o + "green:" + green);
                if (green < o) { //塗色したほうがいい
                    sum += o;
                    oi++;
                    yi++;
//                    System.out.println("opa as green:" + o);
                } else {
                    sum += green;
                    yi++;
//                    System.out.println("2:green:" + green);
                }
            }
        }

        System.out.println(sum);
    }
}
