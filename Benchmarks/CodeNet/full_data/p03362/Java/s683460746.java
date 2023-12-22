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

                System.out.print("2 ");
                int pre = 1;
                int num;
                boolean ch = true;
                for(int i=1; i<N; i++){
                        for(int j=pre+2;;j +=2){
                                num = j;
                                for(int k=2;k<num;k++){
                                        if(num %a k==0){
                                                ch = false;
                                                break;
                                        }
                                }
                                if(ch){
                                        pre = j;
                                        break;
                                }
                        }
                        System.out.print(pre+" ");
                }
        }
}
