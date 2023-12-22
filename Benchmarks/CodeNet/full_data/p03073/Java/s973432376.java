import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        String a = scan.next();
        ArrayList<String> list = new ArrayList<>();
        int count = 0;
        for(int i = 0;i<a.length(); i++){
            list.add(String.valueOf(a.charAt(i)));
        }
        if(a.length() <= 1){

        }else if(a.length() == 2){
            if (list.get(0).equals(list.get(1))){
                count += 1;
            }
        }else{
            for (int i = 1; i < a.length() - 1; i++) {
                if (!list.get(i).equals(list.get(i - 1)) && !list.get(i).equals(list.get(i + 1))) {

                } else if (list.get(i).equals(list.get(i - 1)) && !list.get(i).equals(list.get(i + 1))) {
                    if (list.get(i - 1).equals("0")) {
                        list.set(i - 1, "1");
                        count += 1;
                    } else {
                        list.set(i - 1, "0");
                        count += 1;
                    }
                } else if (!list.get(i).equals(list.get(i - 1)) && list.get(i).equals(list.get(i + 1))) {
                    if (list.get(i + 1).equals("0")) {
                        list.set(i + 1, "1");
                        count += 1;
                    } else {
                        list.set(i + 1, "0");
                        count += 1;
                    }
                } else if (list.get(i).equals(list.get(i - 1)) && list.get(i).equals(list.get(i + 1))) {
                    if (list.get(i).equals("0")) {
                        list.set(i, "1");
                        count += 1;
                    } else {
                        list.set(i, "0");
                        count += 1;
                    }
                }
            }
        }
        PrintWriter out = new PrintWriter(System.out);
        out.println(count);
        out.flush();
        scan.close();
    }
}