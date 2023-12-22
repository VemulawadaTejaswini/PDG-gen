

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int scn = sc.nextInt();

        int answer = (int) Math.pow(100, scn);

        ArrayList<Integer> array = new ArrayList<Integer>();

        for (answer = 0; answer <= (int) Math.pow(100, scn + 1);) {
            answer = answer + (int) Math.pow(100, scn);
            array.add(answer);
            //System.out.println(answer);
        }

        int result = array.get(sc.nextInt()-1);

        //System.out.println(sc.nextInt() - 1);
        //System.out.println(answer);
        if(sc.nextInt() == 100) {
            String s = null;
            System.out.println(s);
        }
        System.out.println(result);

    }

}