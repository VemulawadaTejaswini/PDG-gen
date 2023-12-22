import java.io.*;
import java.util.*;
import java.lang.*;

public class Main {
    static ArrayList<Integer> heights = new ArrayList<>();
    static ArrayList<Integer> bests = new ArrayList<>();
    static int stones = 0;

    public static void main(String args[])  {
        Scanner sc = new Scanner(System.in);

        stones = sc.nextInt() ;
        for (int c=0;c<stones;c++) {
           heights.add(sc.nextInt());
        }

        bests.add(0);
        bests.add(Math.abs(heights.get(0)-heights.get(1)));

        if (stones > 2){
            for (int c=2;c<stones;c++) {
                bests.add(Math.min(bests.get(c-2) + Math.abs(heights.get(c-2) - heights.get(c)), bests.get(c-1) + Math.abs(heights.get(c-1) - heights.get(c))));
            }
        }


        System.out.println(bests.get(bests.size() - 1));

    }


}
