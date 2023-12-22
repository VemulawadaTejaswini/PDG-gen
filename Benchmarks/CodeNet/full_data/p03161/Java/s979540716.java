import java.io.*;
import java.util.*;
import java.lang.*;

public class Main {
    static ArrayList<Integer> heights = new ArrayList<>();
    static ArrayList<Integer> bests = new ArrayList<>();
    static int stones = 0;
    static int maxJump = 0;

    public static void main(String args[])  {
        Scanner sc = new Scanner(System.in);

        stones = sc.nextInt() ;
        maxJump = sc.nextInt();
        for (int c=0;c<stones;c++) {
           heights.add(sc.nextInt());
        }

        bests.add(0);
        bests.add(Math.abs(heights.get(0)-heights.get(1)));

        if (stones > 2){
            for (int c=2;c<stones;c++) {
                int bestJump = 10000000;
                for (int i=1;i <= maxJump;i++){
                    if (c-i >= 0) {
                        int thisJump = bests.get(c-i) + Math.abs(heights.get(c-i) - heights.get(c));
                        if (thisJump < bestJump) {
                            bestJump = thisJump;
                        }
                    }

                }

                bests.add(bestJump);

            }
        }


        System.out.println(bests.get(bests.size() - 1));

    }


}
