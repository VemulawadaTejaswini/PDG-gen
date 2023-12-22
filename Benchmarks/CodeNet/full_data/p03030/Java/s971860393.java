
import java.io.*;
import java.util.*;


public class Main {
    static BufferedWriter log = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader cin  = new BufferedReader(new InputStreamReader(System.in));
    static int[][] arr ;
    static int n, m;

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(cin.readLine());
        Object[][] orders = new Object[n][3];
        for (int i = 0; i < n; i++){
            String[] strs = cin.readLine().split(" ");
            String s = strs[0];
            int p = Integer.parseInt(strs[1]);
            orders[i] = new Object[]{s,p,i+1};
        }

        Arrays.sort(orders, new Comparator<Object[]>() {
            @Override
            public int compare(Object[] o1, Object[] o2) {
                if (((String)o1[0]).compareTo((String)o2[0]) < 0)
                    return -1;
                else if (((String)o1[0]).compareTo((String)o2[0]) > 0)
                    return 1;
                else
                    if((int)o1[1] > (int)o2[1])
                        return -1;
                    else
                        return 1;
            }
        });
        System.out.println();

        for (int i = 0; i < n; i++){
            System.out.println((int)orders[i][2]);
        }


    }


}