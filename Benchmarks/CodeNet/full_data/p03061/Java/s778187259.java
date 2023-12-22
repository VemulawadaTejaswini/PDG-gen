import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        int count = 0;
        int a = Integer.parseInt(scan.next());
        int comp = 0;
        int top = 0;
        for(int i = 0;i<a;i++){
            list.add(Integer.parseInt(scan.next()));
        }
        if(list.size()>2) {
            Collections.sort(list);
            for (int i = 1; i < 3; i++) {
                int calc1 = list.get(i - 1);
                int calc2 = list.get(i);
                while ((count = calc2 % calc1) != 0) {
                    calc1 = calc2;
                    calc2 = count;
                }
                if (top == 0 || top < calc2) {
                    top = calc2;
                }

            }

            int calc1 = list.get(0);
            int calc2 = list.get(2);
            while ((comp = calc2 % calc1) != 0) {
                calc1 = calc2;
                calc2 = comp;
            }
            if (top == 0 || top < calc2) {
                top = calc2;
            }
        }else{
            if(list.get(0)>list.get(1)){
                top = list.get(0);
            }else{
                top = list.get(1);
            }
        }
       PrintWriter out = new PrintWriter(System.out);
        out.println(top);
        out.flush();
        scan.close();
    }
}