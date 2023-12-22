import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Iterator;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

class Main{
        public static void main(String args[]){
                Scanner sc = new Scanner(System.in);
                int N = sc.nextInt();
                ArrayList<Integer> A = new ArrayList<Integer>();
                int max = 0;
                for(int i = 0; i < N; i ++){
                        A.add(sc.nextInt());
                        max = Math.max(max,A.get(i));
                }
                int[] num = new int[max+1];
                for(int n : num)n=0;
                for(int i = 0; i < N; i ++)num[A.get(i)] ++;
                ArrayList<Integer> Num = new ArrayList<Integer>();
                //for(int n : num)System.out.println(n); //check
                int count = 0, card = 0, k = 0;
                for(int i = 0; i < num.length; i ++){
                        if(num[i]!=0){
                                if(num[i]%2==1){
                                        Num.add(1);
                                        k++;
                                }else{
                                        Num.add(2);
                                        k++;
                                }
                                if(Num.get(k-1)>=2)count ++;
                        }
                }
                for(int i = 0; i < Num.size(); i ++)card += Num.get(i);
                /*
                System.out.println(" card sum = "+card+"\ncount = "+count); //check
                for(int i = 0; i < Num.size(); i ++)System.out.println(Num.get(i)); //check
                System.out.print("ans ="); //check
                */
                for(int i=0;i<Num.size();i++){
                        if(Num.get(i) == 2){
                                if(count>=3){
                                        for(int j = Num.size() - 1; ; j--){
                                                if(Num.get(j)==2){
                                                        Num.set(i,1);
                                                        Num.set(j,1);
                                                        count -= 2;
                                                        card -= 2;
                                                        break;
                                                }
                                        }
                                }else if(count == 2){
                                        if(Num.get(i+1) == 2){
                                                System.out.print(card-4);
                                                break;
                                        }else{
                                                System.out.print(card-2);
                                                break;
                                        }
                                }else if(count == 1){
                                        System.out.print(card-2);
                                        break;
                                }
                        if(count == 0){
                                System.out.print(card);
                                break;
                        }
                        }
                }

        }
        /*
        public static boolean counter(int j,ArrayList<Integer> Num){
                for(int i = j + 1; i < Num.size(); i ++){
                        int c = 0;
                        if(Num.get(i)<=2){
                                c ++;
                        }
                }
        }
        */
}
