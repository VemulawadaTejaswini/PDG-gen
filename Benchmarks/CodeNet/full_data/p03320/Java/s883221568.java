import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        final int POW = 18;
        int num = 9 * (POW-1) * POW / 2;
        String[] list = new String[num];
        long[] ll = new long[num];
        int[] div = new int[num];
        ArrayList<String> snuke = new ArrayList<String>();
        int c = 0;
        for (int i = 0; i < POW; i++) {
            for (int l = 1; l < 10; l++) {
                for (int j = 0; j < i; j++) {
                    String tmp = l + "";
                    for (int m = j; m < i-1; m++) {
                        tmp = tmp + "0";
                    }
                    for (int m = 0; m < j; m++) {
                        tmp = tmp + "9";
                    }
                    list[c] = tmp;
                    ll[c] = Long.parseLong(tmp);
                    for(int m=0; m<tmp.length(); m++){
                        div[c] += Integer.parseInt(String.valueOf(tmp.charAt(m)));
                    }
                    c++;
                }
            }
        }
        double min = Double.MAX_VALUE;
        for(int i=0; i<num; i++){
            int p = num - i - 1;
            double tmp = (double)(ll[p]) / (double)(div[p]);
            if(tmp < min + 0.000000001d){
                min = tmp;
                snuke.add(list[p]);
            }
        }
        Collections.reverse(snuke);
        for(int i=0; i<k; i++){
            System.out.println(snuke.get(i));
        }
    }
}