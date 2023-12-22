import java.io.PrintWriter;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int a = scanner.nextInt();
        int[] list = new int[a];
        for(int i=0;i<a;i++){
            list[i] = scanner.nextInt();
        } //listの読み込み

        int hoge = calcSwapCount(list);

        out.println(hoge);
        out.flush();
    }

    private static int calcSwapCount(int[] list){
        int count=0;
        int len = list.length;
        int[] odd = new int[len/2];//奇数番目
        int[] even= new int[len/2];//偶数
        for(int n = 0; n < len; n++) {
            if(n%2==1){//偶数
                even[n/2]=list[n];
            }else {
                odd[n/2]=list[n];
            }
        }
        int swapNumEven = vote(even)[0];
        int swapNumOdd = vote(odd)[0];

        if(swapNumEven==swapNumOdd){
            swapNumEven = 2;
            //配列のスワップカウント
            for (int n = 0; n <= len / 2 - 1; n++) {
                if (even[n] != swapNumEven) {
                    count++;
                }
                if (odd[n] != swapNumOdd) {
                    count++;
                }
            }
        }else {
            //配列のスワップカウント
            for (int n = 0; n <= len / 2 - 1; n++) {
                if (even[n] != swapNumEven) {
                    count++;
                }
                if (odd[n] != swapNumOdd) {
                    count++;
                }
            }
        }

        return count;
    }

    private static int[] vote(int[] list){
        int[] table = new int[100000];
        for(int n=0;n<table.length;n++) {
            table[n]=0;
        }
        for(int n=0;n<list.length;n++){
            table[list[n]]++;
        }
        int[] ret = new int[2];
        ret[0]=(int)maxidx(table).get(0).get(0);
        ret[1]=(int)maxidx(table).get(1).get(0);
        return ret;
    }

    private static ArrayList<ArrayList> maxidx(int[] arr) {
        //配列の最大値のインデックスを返す、複数可
        int max = arr[0];//暫定最大値
        ArrayList<Integer> maxidx = new ArrayList<>(); //最大値のインデックス
        ArrayList<Integer> secondidx = new ArrayList<>(); //最大値のインデックス
        ArrayList<ArrayList> ret = new ArrayList<>(); //最大値のインデックス

        maxidx.add(0);
        if(arr.length==1){
            ret.add(maxidx);
            return ret;
        }else{
            for (int i = 1; i < arr.length; i++) {
                int v = arr[i];
                if (v > max) {
                    max = v;
                    secondidx=maxidx;
                    maxidx.clear();
                    maxidx.add(i);
                } else if (v == max) {
                    maxidx.add(i);
                }
            }
        }
        ret.add(maxidx);
        ret.add(secondidx);
        maxidx.clear();
        secondidx.clear();
        return ret;
    }
}
