import java.util.*;
 
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //next()で受け取って/を閾値で分けて配列に入れる
        String date[] = sc.next().split("/", -1);
        sc.close();
        String kekka = jud(date);
        System.out.println(kekka);
    }
    
    private static String jud(String data[]){
        int a = 0;
        String kekka = null;
        if((a = Integer.parseInt(data[0])) <= 2019){
            if(Integer.parseInt(data[1]) < 5){
                kekka = "Heisei";
            }else{
                kekka = "TBD"; 
            }
        }
        return kekka;
    }
}