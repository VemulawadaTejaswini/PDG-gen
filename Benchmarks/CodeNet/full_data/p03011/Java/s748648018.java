import java.util.*;

import sun.tools.java.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] time = new int[3];
        for(int i = 0; i < 3; i++){
            time[i] = sc.nextInt();
        }
        Arrays.sort(time);

        System.out.println(time[0] + time[1]);
    }
}