import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int a =scan.nextInt();
        String answer = null;
        ArrayList <Integer> b = new ArrayList<Integer>();
        for(int i = 0;i<5;i++){
            b.add(scan.nextInt());
        }
        Collections.sort(b);

        for(int i = 4;i>0;i--){
            for(int q = 1; q == i ;q++){
                if((b.get(i) - b.get(i-q)) > a){
                    answer = "Yay!";
                }else {
                    answer = ":(";
            }
            }
        }

        PrintWriter out = new PrintWriter(System.out);
        out.println(answer);
        out.flush();
        scan.close();
    }
}