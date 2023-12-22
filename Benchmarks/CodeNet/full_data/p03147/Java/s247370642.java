/*
 * 0を区切りに1以上が続く区間をスタックで管理しようとしたが、よく分からなくなり断念。
 * 方針を以下に変更
 * ①0が出てくるまで、目標の高さを先頭からマイナス1する
 * ②0が出てきた場合、先頭に戻る。
 *   ただし、1以上の区間に遭遇していない(先頭から連続する0の区間の場合) 例:[0,0,0,0,2,2,3]とか
 *   場合は先頭に戻らない
 * ③終了条件を満たすまで①、②を繰り返す。
 *   ⇒目標の高さが全て0になったら終了
 */

import java.util.Scanner;
class Main{
  public static void main(String[] args) {
    Main mmcgmCompany = new Main();
    mmcgmCompany.run();
  }
  private void run() {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] ary = new int[n];
    int cnt = 0;
    for(int i=0; i<n; i++) {
      ary[i] = sc.nextInt();
    }

    boolean br = true;
    while(br){
      //out(ary);

      // 終了条件
      br = false;
      for(int i=0; i<n; i++) {
        if(ary[i] > 0 ) {
          br = true;
          break;
        }
      }
      boolean zeroSecEnd = true;
      for(int i=0; i<n; i++) {

        // 先頭の0を読み飛ばす
        if(ary[i] <= 0 && zeroSecEnd) {
          continue;
        }

        // 1以上の区間をマイナス1する。1以上の区間が終わったらブレイク。
        if(ary[i] <= 0) break;
        ary[i]--;
        zeroSecEnd = false;
      }
      // カウントアップ
      if (!zeroSecEnd) cnt++;

    }
    System.out.println(cnt);
  }
//  private void out(int[] pary) {
//	  for(int i : pary)
//		  System.out.print(i + " ");
//	  System.out.println();
//  }
}
