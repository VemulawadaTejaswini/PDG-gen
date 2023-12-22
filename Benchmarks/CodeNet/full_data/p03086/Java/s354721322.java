import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String[] sp;
        int max = 0;
        int num = 0;
        sp = s.split("");
        for (int i = 0; i < sp.length; i++) {
            if (sp[i].equals("A") || sp[i].equals("C") || sp[i].equals("G") || sp[i].equals("T"))
                num++;
            else {
                if (max < num)
                    max = num;
                num = 0;
            }
        }
        if (max < num)
            max = num;
        System.out.println(max);
    }
}