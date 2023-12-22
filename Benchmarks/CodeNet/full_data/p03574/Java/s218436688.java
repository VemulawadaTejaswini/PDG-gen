import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int hight = sc.nextInt();
		int width = sc.nextInt();
        
        ArrayList<String> list = new ArrayList<>();
      
        for (int i =0; i < hight; i++) {
          	// 文字列の入力
            list.add(sc.next());
        }
      
        int[][] value = new int[hight][];
        for(int count = 0; count < hight; count++) {
          for(int i = 0; i < width; i++) {
            if (s.charAt(i).equal("#")) {
              // 地雷箇所はマイナス値になるようにする
              value[count][i] = -10;
              boolean hasAbove = count > 0;
              boolean hasUnder = count + 1 < width;
              // 上
              if (hasAbove) {
                value[count - 1][i] += 1;
              }
              // 下
              if (hasUnder) {
                value[count + 1][i] += 1;
              }
              
              // 左列が存在するとき
              if (i > 0) {
                // 左
                value[count][i - 1] += 1;
                // 左上
                if (hasAbove) {
                  value[count - 1][i - 1] += 1;
                }
                // 左下
                if (hasUnder) {
                  value[count + 1][i - 1] += 1;
                }
              }
              // 右列が存在するとき 
              if (i + 1 < width) {
                // 右
                value[count][i + 1] += 1;
                // 右上
                if (hasAbove) {
                  value[count - 1][i + 1] += 1;
                }
                // 右下
                if (hasUnder) {
                  value[count + 1][i + i] += 1;
                }
              }
            }
          }
        }
                
        for (int[] childValue : value) {
            String s = "";
            for(int i : childValue) {
              if (i < 0) {
                s += "#";
              } else {
                s += String.valueOf(i);
              }
            }
            // 出力
			System.out.println(s);
        }
	}
}
