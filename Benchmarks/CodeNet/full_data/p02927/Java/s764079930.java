import java.util.*;
class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();       //月
        int d = sc.nextInt();       //日
        int d1;
        int d2;
        int seki_cnt = 0;

        for (int i = 2;i <= m;i++){ 
                //System.out.println(m.substring(i-1,i));
                for(int x = 20; x <= d;x++){
                    d1 = x / 10;
                    d2 = x % 10;
                    if (d1 * d2 == i && d2 >= 2){
                        seki_cnt ++;
                        //System.out.println(i + "/" + x);
                    }
                }               
        }
        System.out.println(seki_cnt);

        sc.close();
    }
}