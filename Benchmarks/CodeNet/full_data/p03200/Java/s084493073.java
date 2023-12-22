import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();

        int num = 0;


        while(str1.indexOf("BW") != -1){
            str1.replaceFirst("BW", "WB");
            num++;
        }

        System.out.println(num);
 
 
    }
}
