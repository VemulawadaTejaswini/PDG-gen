import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try {
            // 標準入力
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            String strArr[] = br.readLine().split(" ");
            int n = Integer.parseInt(strArr[0]);
            int m = Integer.parseInt(strArr[1]);
            ArrayList<Ship> startList = new ArrayList<Ship>();
            ArrayList<Ship> endList = new ArrayList<Ship>();
            for (int i = 0; i < m; i++) {
                strArr = br.readLine().split(" ");
                Ship tmp = new Ship();
                tmp.start = Integer.parseInt(strArr[0]);
                tmp.end = Integer.parseInt(strArr[1]);
                if (tmp.start == 1) {
                    startList.add(tmp);
                } else if (tmp.end == n) {
                    endList.add(tmp);
                }
            }
            boolean flag = false;
            for (int i = 0; i < endList.size(); i++) {
                int tmp = endList.get(i).start;
                for (int j = 0; j < startList.size(); j++) {
                    if (startList.get(j).end == tmp) {
                        flag = true;
                        break;
                    }
                }
                if (flag) {
                    break;
                }
            }
            if (flag) {
                System.out.println("POSSIBLE");
            } else {
                System.out.println("IMPOSSIBLE");
            }
        } catch (IOException e) {
            e.printStackTrace();
           }
    }

}

class Ship {
    int start;
    int end;
}
