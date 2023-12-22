import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // input S T
        // 長さ 3 の文字列 S,T について、順番通りで一致する文字が何文字あるか出力せよ
        Scanner sc = new Scanner(System.in);
        String strS = sc.nextLine();
        String strT = sc.nextLine();
        int retNum = 0;
        if(strS.substring(0,1).equals(strT.substring(0,1))){
            retNum++;
        }
        if(strS.substring(1,2).equals(strT.substring(1,2))){
            retNum++;
        }
        if(strS.substring(2,3).equals(strT.substring(2,3))){
            retNum++;
        }
        System.out.println(retNum);
    }
}
