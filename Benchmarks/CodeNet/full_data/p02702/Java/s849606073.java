
import java.util.Scanner;

public class Test{
    public static void main(String[] args){
        int num = 0;
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        char[] c = a.toCharArray();
        String b ="";
        for (int i = 0;i<a.length();i++){
            b+= c[i];
            int y = Integer.valueOf(b);
            if (y % 2019 == 0){
                num++;
                b = "";
                i--;
            }
        }
        System.out.println(num);
    }
}