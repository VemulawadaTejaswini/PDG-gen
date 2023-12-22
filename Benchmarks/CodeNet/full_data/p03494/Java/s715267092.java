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
                int N = sc.nextInt();
                int[] a = new int[N];
                for(int i=0; i<N; i++){
                    a[i] = sc.nextInt();
                }
                int count=0;
                boolean ch = true;
                for(count=0; ; count++){
                    for(int a : a){
                        if(a%2 == 0){
                            a /= 2;
                        }else{
                            ch = false;
                            break;
                        }
                    }
                    if(!ch)break;
                }
                System.out.println(count);
        }
}