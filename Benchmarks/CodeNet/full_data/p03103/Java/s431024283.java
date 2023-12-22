import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();

        int M = scan.nextInt();


        int A[] = new int[N];

        int B[] = new int[N];

        Map<Integer,Integer> AB = new HashMap<Integer,Integer>();

        for(int i = 0; i < N; i++){

            A[i] = scan.nextInt();
            B[i] = scan.nextInt();

            AB.put(A[i],B[i]);

        }

        int sortList[] = new int[N];

        sortList = A;

        Arrays.sort(sortList);

        //今いくつ買った？
        int buyCnt = 0;

        //いくら払った？
        int pay = 0;

        int cnt = 0;

        while(true){

            //買わねばならない数
            int mustBuy = M - buyCnt;

            if(mustBuy == 0){
                break;
            }

            //今買う数
            int nowBuy = AB.get(sortList[cnt]);

            if(nowBuy > mustBuy){
                nowBuy = mustBuy;
            }

            pay = pay + nowBuy * sortList[cnt];

            AB.remove(sortList[cnt]);

            buyCnt = buyCnt + nowBuy;
            cnt++;

        }

        System.out.print(pay);

    }
}