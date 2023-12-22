import java.util.*;
public class Main{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                int a = sc.nextInt();
                int b = sc.nextInt();
                int k = (int)Math.log10(b) + 1;
                a = (int)(a * Math.pow(10 , k) + b);
                double yono = Math.sqrt(a);
                if(yono - Math.ceil(yono) == 0){
                        System.out.println("Yes");
                }else{
                        System.out.println("No");
                }
        }
}
//腹痛は治りました
//今日はAtCoderをそんなにできそうにありません