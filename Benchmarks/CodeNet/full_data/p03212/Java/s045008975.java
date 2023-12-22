import java.util.*;
public class Main {

    static int N;


    private  static int count753num(long currentNumber, boolean isThree, boolean isFive, boolean isSeven ){

        int ret = 0;

        //現在の値が入力された値をこえた
        if(N < currentNumber) return 0;

        //現在の値の下一桁を取得
        int length = String.valueOf(currentNumber).length();
        int lastDigit = Integer.parseInt( Long.toString(currentNumber).substring(length -1));

        //現在の値の下一桁の値が3,5,7のいずれかであるか調べる
        if(lastDigit == 3) isThree = true;
        if(lastDigit == 5) isFive  = true;
        if(lastDigit == 7) isSeven = true;

        //すべてtrueになったら、753数としてカウント
        if(isThree && isFive && isSeven) ret++;

        //現在の値を　xx3にして再帰
        ret += count753num(currentNumber*10 + 3 ,isThree, isFive, isSeven);
        //現在の値を　xx5にして再帰
        ret += count753num(currentNumber*10 + 5, isThree, isFive, isSeven);
        //現在の値を　xx7にして再帰
        ret += count753num(currentNumber*10 + 7, isThree, isFive, isSeven);

        return ret;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        N = Integer .parseInt(scan.next());

        //0から(7,5,3)の値のみで構成される数だけを調べ、その中で753数となったものをカウントする
        int num = count753num(0, false, false, false);

        System.out.println(num);
    }
}