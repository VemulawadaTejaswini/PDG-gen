import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int kosu = sc.nextInt();
        int l[]  = new int[kosu];
        int m[]  = new int[kosu];
        boolean endFlg = false;

        for (int i = 0; i < kosu; i++) {
            l[i] = sc.nextInt();
        }
        int count = 0;
        while(!endFlg){
            for (int i = 0; i < l.length; i++){
                if(l[i]%2 == 0){
                    m[i] = l[i]/2;
                }
                else{
                    endFlg = true;
                    break;
                }
            }
            if(!endFlg){
                count++;
                l = m;
            }
        }
        System.out.println(count);
    }
}
