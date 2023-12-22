import java.util.*;
import java.util.stream.Stream;

public class Main {//ここが Main になっている
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String line1;
        int[] k_n_array = new int[2];
        line1 = sc.nextLine();
        String[] strArray = line1.split("");
        // for (int i = 0; i < strArray.length; i++) {// // "strArray"を1文字ずつ表示
            // System.out.println("strArrayの要素番号" + i + "の時：" + strArray[i]);
        // }
        int count=0;
        for (int i = 0; i < strArray.length; i++) {
            // System.out.println("strArrayの要素番号" + i + "の時：" + strArray[i]);
            // System.out.println(i % 2 == 0);
            // System.out.println(strArray[i]);
            // System.out.println(strArray[i].equals("0"));
            if (i % 2 == 0 & strArray[i].equals("0")){
                // System.out.println("a");
                count++;
            }
            if (i % 2 == 1 && strArray[i].equals("1")){
                // System.out.println("b");
                count++;
            }
        }
        int another = strArray.length - count;
        if (count >= another){
            System.out.println(another);
        }
        else{
            System.out.println(count);
        }
    }
}
