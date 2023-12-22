import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created by kennzya on 2017/09/30.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String k = Integer.toBinaryString(sc.nextInt());
        String[] kArray = k.split("");

        int result = 0;
        for(int i = 0;i < n ; i++){
            // 比較する数字
            String number = Integer.toBinaryString(sc.nextInt());
            // 価値
            int value = sc.nextInt();

            String[] tmpArray = number.split("");
            List<String> numberArary = new ArrayList<>();
            //numberArrayを整形
            if(tmpArray.length < kArray.length){
                for(int j = 0;j<kArray.length - tmpArray.length;j++){
                    numberArary.add("0");
                }
            }
            for(int l = 0;l<tmpArray.length;l++){
                numberArary.add(tmpArray[l]);
            }
            // System.out.println(String.join("",numberArary));
            boolean check = true;

            for(int m = 0;m < numberArary.size();m++){
                if(numberArary.get(m).equals("1") && kArray[m].equals("0")){
                    check = false;
                    break;
                };
            }
            if(check){
                result+=value;
            }
        }
        System.out.println(result);
    }
}
