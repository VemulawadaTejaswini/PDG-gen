import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    void solve() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // スイッチの数
        int M = sc.nextInt(); // 電球の数

        // スイッチ： 0 ～ N-1
        // 電球：     0 ～ M-1
        // connectedSwitch： 各電球に繋がっているスイッチ達のリスト
        List<List<Integer>> connectedSwitchesList = new ArrayList<>();
        for (int i = 0; i < M; i++) {
            int k = sc.nextInt();
            List<Integer> connectedSwitches = new ArrayList<>();
            for (int j = 0; j < k; j++) {
                connectedSwitches.add(sc.nextInt() - 1); // 問題文上のスイッチのインデックスを、プログラミング上のインデックスに合わせる。
            }
            connectedSwitchesList.add(connectedSwitches);
        }
        int[] p = new int[M];
        for (int i = 0; i < M; i++) {
            p[i] = sc.nextInt();
        }

        // スイッチの最大数は10なので、on/off の組み合わせは全部で 1024 通り。
        // 総当たりで試しても間に合うはず。 on/off の全ての組み合わせを作成したい。
        int onOffCombinationCount = (int)(Math.pow(2, N));
        int count = 0;
        for (int onOff = 0; onOff < onOffCombinationCount; onOff++) {
            boolean isAllLightsOn = true;
            for (int i = 0; i < M; i++) {
                boolean isOn = checkLight(onOff, connectedSwitchesList.get(i), p[i], N);
                if (isOn == false) {
                    isAllLightsOn = false;
                    break;
                }
            }
            if (isAllLightsOn == true) {
                count++;
            }
        }

        System.out.print(count);
    }

    // 与えられた ON/OFF のリストと、電球とスイッチの接続状況から、その電球がつくかどうか調べる。
    boolean checkLight(int onOffBit, List<Integer> connectedSwitches, int p, int N) {
        StringBuffer tmp = new StringBuffer();
        //
        for (int i = 0; i < N; i++) {
            if (connectedSwitches.contains(i)) {
                tmp.append(1);
            }
            else {
                tmp.append(0);
            }
        }
        int switchBit = Integer.parseInt(tmp.toString(), 2);
        int lightOnCount = Integer.bitCount(onOffBit & switchBit);
        if (lightOnCount % 2 == p) {
            return true;
        }
        else {
            return false;
        }
    }


    // Main
    public static void main(String[] args) {
        new Main().solve();
    }
}