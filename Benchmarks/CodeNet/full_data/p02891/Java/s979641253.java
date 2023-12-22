import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int K = sc.nextInt();
        String MixS = "";
        
        //結合文字列作成
        for(int i=0; i<K;i++) {
            MixS = MixS + S;
        }

        int count = 0;

        //比較
        for(int i=1;i<MixS.length();i++) {
            //もし直前の文字と同じなら
            if(MixS.charAt(i) == MixS.charAt(i-1)){       
                count++;
                //一つ飛ばし
                i++;
            }
        }
        System.out.println(count);
    }
}