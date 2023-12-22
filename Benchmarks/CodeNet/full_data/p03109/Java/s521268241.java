import java.util.Scanner;
import java.util.Arrays;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String S = scan.next();

        String[] str = S.split("/",0);
        scan.close();
        boolean flag = false;
        
        if(Integer.compare(2019,Integer.parseInt(str[0])) == 1){
                        System.out.println(str[0]);
            flag = true;
        } else if(Integer.compare(2019,Integer.parseInt(str[0])) == 0 && Integer.compare(04,Integer.parseInt(str[1])) == 1){
            flag = true;
        }else if(Integer.compare(04,Integer.parseInt(str[1])) == 0 && Integer.compare(31,Integer.parseInt(str[2])) == 1){
            flag = true;
    }
        if(flag == true){
            System.out.println("Heisei");
        }else{
             System.out.println("TBD");
        }
    }
}