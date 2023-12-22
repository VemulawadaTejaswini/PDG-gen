import java.util.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(in);
long ans=0;
//入力
String s = sc.next();
//String Builderを用意
StringBuilder sb = new StringBuilder();
//n=文字列長
int n=s.length();
//文字間と末尾に+を挿入→後で消していき計算式として処理
String t="";
for (int i = 0; i < n; i++) {
    t+=Character.toString(s.charAt(i))+"+";
}

for (int i = 0; i < (int)pow(2,n-1); i++) {
    //pはiを二進数表記にした文字列
    String p=Integer.toBinaryString(i);
    //左を0で埋める
    for (int j = 0; j < n-1-p.length(); j++) {
        p="0"+p;
    }
    //sbにtを入れる
    sb.append(t);
    //sbからpの0に対応する部分の+を-に置き換える
    for (int j = 0; j < n-1; j++) {
        if(p.charAt(j)=='0'){
            sb.setCharAt(2*j+1, '-');
        }
    }
    //sbをString型にする
    String q=sb.toString();
    //-を消去する
    q=q.replaceAll("-","");
    //ここで計算する　tempは、+が現れるまでの数字部分
    String temp="";
    for (int j = 0; j <q.length(); j++) {
        if(q.charAt(j)=='+'){
            //この部分でなぜかtemp=""(空の文字列)になってしまう……
            //一文字目、q.charAt(0)が'+'になることがあるんですかね？
            //上のif()内の変数jがiになってしまっていた……
            ans+=Integer.parseInt(temp);
            //数字を足したので初期化する
            temp="";
        }else{
            temp+=Character.toString(q.charAt(j));
        }
    }
    sb.delete(0, sb.length());
}
//答えの出力
    out.println(ans);
}}