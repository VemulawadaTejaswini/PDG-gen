import java.util.*;
import java.util.stream.Collectors;

class Main {
	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int N = Integer.parseInt(sc.next());
      List<Integer> list = new ArrayList<>();
      
      for (int i = 0; i < N; ++i) {
        list.add(Integer.parseInt(sc.next()));
      }
      
      Map<Integer, List<Integer>> tempMap = list.stream().collect(Collectors.groupingBy(Integer::intValue));
      List<Integer> tempList = tempMap.values().stream().map(List::size).collect(Collectors.toList());
      tempList.sort(Comparator.comparingInt(Integer::intValue).reversed());
      Integer[] arr = tempList.toArray(new Integer[0]);
      
      for (int i = 1; i <= N; ++i) {
        Integer[] temparr = arr.clone();
        // 最終的な回数
        int result = 0;
        int counter = 0;
        boolean isFinished = false;
        // 明らかに不可能な場合はループを回さない
        if (temparr.length < i) isFinished = true;
        else if (temparr.length == i) {
          result = temparr[i - 1];
          isFinished = true;
        }
        
        // 食べられる間ループする
        while (!isFinished) {
          isFinished = true;
          // 先頭から辿っていって数の多いものからたべていく
          for (int j = 0; j < temparr.length; ++j) {
            if (temparr[j] > 0) {
              // 食べられる場合は1減らしてカウンタをインクリメント
              temparr[j]--;
              counter++;
            }
            if (counter == i) {
              // カウンタがKに達した場合は食べられた回数をインクリメントし、カウンタを初期化して次のループへ
              result++;
              counter = 0;
              isFinished = false;
              break;
            }
          }
          
        }
        
        System.out.println(result);
      }
    }
}