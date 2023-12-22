import java.util.*;
public class Main {
    public static void main(String[] args){
        Double a = 0.0;
        Scanner sc = new Scanner(System.in);
        //人数出力
        int ple = Integer.parseInt(sc.next());
        //人数分回す
        for(int i=0;i<ple;i++){
            //金額
            Double b = Double.parseDouble(sc.next());
            //単位
            String c = sc.next();
            if("BTC".equals(c)){
                b = b * 380000;
            }
            a = a + b;
        }
        sc.close();
        System.out.println(a);
    }
}