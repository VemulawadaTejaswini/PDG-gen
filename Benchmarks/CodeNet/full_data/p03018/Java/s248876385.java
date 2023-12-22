import java.util.*;

class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();

        // ABC を　BCA に置換
        str.replace("ABC", "BCA");

        // split で BCA を配列にいれる
        String sum[] = str.split("BCA",0);

        // BSAの配列の要素の数を数え、出力する
        System.out.print(sum.length);


    }
}