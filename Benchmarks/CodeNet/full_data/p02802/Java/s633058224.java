import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // 問題数
    int cases = sc.nextInt();
    // 提出数
    int numOfSubmits = sc.nextInt();

    // 各問題で誤った数を記録しておく
    int[] waEachProblems = new int[cases];
    // 各問題に正答したことがあるか否かを記録しておく
    Map<Integer, Boolean> map = new HashMap<>();
    // 上記の初期状態で記録する
    for (int i = 0; i < cases; i++) {
      map.put(i + 1, false);
      waEachProblems[i] = 0;
    }

    int waResult = 0;
    int acResult = 0;
    int caseNum;
    String submitResult;
    for (int i = 1; i <= numOfSubmits; i++) {
      caseNum = sc.nextInt();
      submitResult = sc.next();
      // 正答したことがない問題について処理を行う
      if (!map.get(caseNum)) {
        // 誤りであれば、当該問題の誤り数を加算する
        if (submitResult.equals("WA")) {
          waEachProblems[caseNum - 1]++;
        }
        // 正答であれば、正答数の記録、当該問題の誤り数の計上、および正答状況の保存を行う
        if (submitResult.equals("AC")) {
          acResult++;
          waResult += waEachProblems[caseNum - 1];
          map.put(caseNum, true);
        }
      }
    }
    System.out.println(acResult + " " + waResult);
  }
}
