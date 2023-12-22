// B
import java.util.*;
//package hoge; のようなパッケージ宣言は提出前に除く
//インポート文など
public class Main { //クラス名はMain
    public static void main(String[] args) {
        //コード
        Scanner sc = new Scanner(System.in);
        int n = 0;
        String a = "";
        String b = "";
        String c = "";
        while (sc.hasNextInt()){
            n = Integer.parseInt(sc.next());
            a = sc.next();
            b = sc.next();
            c = sc.next();
        }
        if (a.equals(b) && a.equals(c)) System.out.println("0");
        else {
            char[] cha = a.toCharArray();
            char[] chb = b.toCharArray();
            char[] chc = c.toCharArray();
            int count = 0;
            for(int i = 0; i < n ; i++) {
                if(chb[i] == chc[i] && cha[i] == chc[i] && cha[i] == chc[i]) continue;
                if(cha[i] != chb[i]) count = count + 1;
                if(cha[i] != chc[i]) count = count + 1;
                if(chb[i] == chc[i]) count = count - 1;
            }
            System.out.println(count);
        } 
    }
}