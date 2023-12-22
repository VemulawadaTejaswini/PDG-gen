import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.lang.Math;

public class Main {

    public static void main(String[] args) {
	    // input N K A0 A1 ... An-1
        // A = A0, A1, ... An-1 なる数列 A を、
        // K 回繰り返した数列をBと定義する。
        // B の転倒数を、10 ^ 9 + 7 で割った余りを出力せよ
        Scanner sc = new Scanner(System.in);
        int numLength = sc.nextInt();
        int numTimes = sc.nextInt();
        List<Integer> numSequence = new ArrayList<>();
        for(int i = 0; i < numLength; i++){
            numSequence.add(sc.nextInt());
        }
        // A の中で転倒数がいくつあるか。
        // Bに展開したとき転倒数がいくつあるか。≒ A の中でその数字より小さい数字がいくつあるか。
        // 1,3,2,4 -> 0 + 1 + 0 + 0
        // 1,3,2,4,1,3,2,4 -> (0+0) + (1+2) + (0+1) + (0+3)
        // 1,3,2,4,1,3,2,4,1,3,2,4 -> (0+0+0) + (1+2+2) + (0+1+1) + (0+3+3)
        int fallNumInA = 0;
        int smallNumInA = 0;
        for(int i = 0; i < numLength; i++){
            for(int j = 0; j < numLength; j++){
                if(i == j){
                    continue;
                } else {
                    if(numSequence.get(i) > numSequence.get(j)) {
                        smallNumInA++;
                        if (i < j){
                            fallNumInA++;
                        }
                    }
                }
            }
        }
        long trueAnswer = fallNumInA + smallNumInA * (numTimes - 1);
        long divNum = (long)Math.pow(10, 9) + 7;
        System.out.println(trueAnswer % divNum);
    }
}
