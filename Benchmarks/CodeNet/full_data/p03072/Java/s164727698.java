
AtCoder Beginner Contest 124
 日本語 
 ryunocchi (Contestant) 
コンテスト時間: 2019-04-13(土) 21:00 ~ 2019-04-13(土) 22:40 AtCoderホームへ戻る
 トップ
 問題
 質問
 提出
 提出一覧
 順位表
 コードテスト
コードテスト
言語
ソースコード
1
import java.util.*;
2
//System.out.println("")
3
​
4
public class Main{
5
    public static void main(String[] args){
6
        Scanner sc = new Scanner(System.in);
7
        int n = sc.nextInt();
8
        int cnt =1;
9
        int h[]= new int[n];
10
        
11
        for(int i = 0; i<n; i++){
12
            h[i] = sc.nextInt();
13
        }
14
        int max =h[0];
15
        for(int i=1; i<n; i++){
16
                if(max<=h[i]){
17
                    cnt++;
18
                    max = Math.max(max,h[i]);
19
                }
20
        }
21
        System.out.println(cnt);
22
    }
23
}
※ 512 KiB まで
※ ソースコードは「Main.拡張子」で保存されます




標準入力
4
6 5 6 8
※ 512 KiB まで

標準出力
3

標準エラー出力
終了コード	0
実行時間	109 ms
メモリ	31540 KB
FacebookTwitterHatenaShare
ルール 用語集
利用規約 プライバシーポリシー 個人情報保護方針 企業情報 よくある質問 お問い合わせ 資料請求
Copyright Since 2012 ©AtCoder Inc. All rights reserved.