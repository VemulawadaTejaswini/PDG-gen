/*
 * X 段重ねの鏡餅 (X≥1) とは、X 枚の円形の餅を縦に積み重ねたものであって、どの餅もその真下の餅より直径が小さい（一番下の餅を除く）もののことです。
 * 例えば、直径 10、8、6 センチメートルの餅をこの順に下から積み重ねると 3 段重ねの鏡餅になり、餅を一枚だけ置くと 1 段重ねの鏡餅になります。
 * 
 * ダックスフンドのルンルンは N 枚の円形の餅を持っていて、そのうち i 枚目の餅の直径は di センチメートルです。
 * これらの餅のうち一部または全部を使って鏡餅を作るとき、最大で何段重ねの鏡餅を作ることができるでしょうか。
 */

import java.util.*;
	public class Main{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            //入力
            int n = Integer.parseInt(sc.next());
            
            int[] list = new int[n];
            
            for(int i=0; i<n; i++){
            	list[i] = Integer.parseInt(sc.next());
            }
            //ソートする
            Arrays.sort(list);
            // 同じ数であるため鏡餅から省かなくてはならない餅の数count
            int count = 0;

            for(int i=0; i<n-1; i++){
            	if(list[i] == list[i+1]){
            		count++;
            	}
            }
            //差を出力
            System.out.println(n-count);
            sc.close();
        }
    }
	