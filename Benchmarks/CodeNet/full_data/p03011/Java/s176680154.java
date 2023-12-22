import java.util.*;

import sun.tools.java.Scanner;

class Main{
    Scnner sc = new Scanner(System.in);

    int[] time = new int[3];
    for(int i = 0; i < 3; i++){
        time[i] = sc.nextInt();
    }
    Arrays.sort(time);

    Systme.out.println(time[0] + time[1]);
}