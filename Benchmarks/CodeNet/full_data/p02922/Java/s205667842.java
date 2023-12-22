import java.util.*;
public class Main {
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
  	int A = sc.nextInt(); //2<=A<=20
	int B = sc.nextInt(); //1<=B<=20
  	int tap = 0;
/*
高橋くんの家には電源プラグの差込口が 1 口しかありません。
そこで、高橋くんは A 個口の電源タップをいくつか使って未使用の差込口を 
B 口以上に拡張したいと考えています。
A 個口の電源タップ 1 つと未使用の差込口 1 口を使って、新たに差込口を A 口増やすことができます。
最小でいくつの電源タップが必要でしょうか。
*/
  	int i=0;
  	while( (A-1) * tap + 1 < B ){
  		tap++;
    }
  
  	System.out.println(tap);                           
}
}