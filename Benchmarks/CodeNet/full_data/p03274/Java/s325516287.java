import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class Main3{

    static int N;
    static int K;

    static int b[];

    static List<Integer> num;
    static int sum1;

    public static void main(String args[]) throws Exception {
      
        Scanner sc = new Scanner(System.in);
        N= sc.nextInt();
        K= sc.nextInt();
        num = new ArrayList<>();
        boolean bool  = true;
        for (int i = 0; i < N; i++) {

            num.add(sc.nextInt());

        }

        for (int i = 0; i < num.size(); i++) {
            if (num.get(i) == 0){
                bool = false;
            }
        }
        if (bool){ //说明里面没有0.0的蜡烛

            num.add(0);
            Collections.sort(num);

            int index=0;
            for (int i = 0; i < num.size(); i++) {
                if (num.get(i) == 0){
                    index = i;
                }
            }
            if (index == 0){
                System.out.println(Math.abs(num.get(K)));
            }else if (index == num.size()-1){
                System.out.println(Math.abs(num.get(index-K)));
            }else{
                if (index >= K){
                    sum1=Math.abs(num.get(index-K));
                    getMin(index,index-K,K+1,sum1,sum1);
                }else{
                    sum1=Math.abs(num.get(0))*2 + Math.abs(num.get(K));
                    getMin(index,1,K+1,sum1,sum1);
                }
            }
        }else{
            int index=0;
            for (int i = 0; i < num.size(); i++) {
                if (num.get(i) == 0){
                    index = i;
                }
            }
            if (index == 0){
                System.out.println(Math.abs(num.get(K-1)));
            }else if (index == num.size()-1){
                System.out.println(Math.abs(num.get(index-(K-1))));
            }else{
                if (index >= K-1){
                    sum1=Math.abs(num.get(index-(K-1)));
                    getMin(index,Math.abs(index-K),K+1,sum1,sum1);
                }else{
                    sum1=Math.abs(num.get(0))*2 + Math.abs(num.get(K-1));
                    getMin(index,1,K+1,sum1,sum1);
                }
            }
        }

    }
    public static int getOne(int index,int start,int end){
        if (index > start){
            return  Math.abs(num.get(start))*2 + Math.abs(num.get(end));
        }else{
            return Math.abs(num.get(end));
        }

    }
    public static void getMin(int index,int start,int end,int sumNew,int  sumOld){

        if (sumNew > sumOld || sumOld==0){
            System.out.println(sumOld);
        }else {
            int sum2 = getOne(index,start,end);
            if (end+1 < num.size()){
                getMin(index,start+1,end+1,sum2,sumNew);
            }
        }
    }

}