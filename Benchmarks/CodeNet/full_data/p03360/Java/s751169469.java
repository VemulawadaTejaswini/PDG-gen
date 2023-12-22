import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Iterator;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;
import java.util.Map;
import java.util.HashMap;

class Main{
        public static void main(String args[]){
                Scanner sc = new Scanner(System.in);
                int[] num = new int[3];
                num[0] = sc.nextInt();
                num[1] = sc.nextInt();
                num[2] = sc.nextInt();
                int K = sc.nextInt();
                int max=0;
                int maxN=0;
                for(int i=0; i<3; i++){
                        if(max<num[i]){
                                max = num[i];
                                maxN = i;
                        }
                }

                for(int i=0; i<K; i++)num[maxN] = num[maxN] * 2;
                System.out.println(num[0]+num[1]+num[2]);
        }
}

