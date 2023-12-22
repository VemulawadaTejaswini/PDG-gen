import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        final String s = scan.next();   
        final String t = scan.next();
        String resultStr = s;
        boolean isFind = true;
        String tempT;
        int lastIndex = -1; // 前の文字位置

        for(int i = 0; i < t.length(); i++){
            tempT = t.substring(i, i + 1);
            // s内に文字が存在するか
            if(s.contains(tempT)){
                // 前の文字位置以降に文字が存在するか
                if(resultStr.indexOf(tempT,lastIndex + 1) != -1){
                    // 存在しない→sを追加
                    resultStr = resultStr + s;
                }else{
                    // 存在する→文字追加なし
                }
                // lastIndexを更新
                lastIndex = resultStr.indexOf(tempT, lastIndex + 1);
            }else{
                isFind = false;
                break;
            }
        }
        if(isFind){
            resultStr = resultStr.substring(0, lastIndex + 1);
            System.out.println(resultStr.length());
        }else{
            System.out.println("-1");
        }
        scan.close();
    }
}