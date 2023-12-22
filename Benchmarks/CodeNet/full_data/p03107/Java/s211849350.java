
import java.util.*;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        List<Integer> list = new ArrayList<Integer>();

        for(int i = 0; i < S.length(); i++){
            list.add(Character.getNumericValue(S.charAt(i)));
        }


        int index = 0;
        int ans = 0;
        while(index < list.size() - 1){
            int num = list.get(index);
            int nextNum = list.get(index+1);
            if(num + nextNum == 1){   //01, 10の時
                ans += 2;
                list.remove(index);
                list.remove(index);  //連続で削除する
                index--;
                if(index < 0){ index = 0; }
            } else {
                index++;
            }
        }

        out.println(ans);
    }
}
