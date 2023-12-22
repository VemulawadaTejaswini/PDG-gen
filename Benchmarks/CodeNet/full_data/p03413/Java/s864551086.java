import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;
import java.util.Scanner;

class Main{

    static long getmax(List<Long> array){
        long res = Long.MIN_VALUE;
        long min = 0;
        for(int i=0;i<array.size();++i){
            long n = array.get(i);
            if(n-min > res)res = n-min;
            if(n < min)min=n;
        }
        return res;
    }

    static long getIndex(List<Long> array, long value){
        long min = 0;
        long minIndex=-1;
        for(int i=0;i<array.size();++i){
            long n = array.get(i);
            if(n-min == value)return (long)i*1000000 + minIndex+1;
            if(n<min){
                min=n;
                minIndex=i;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        long[] a = new long[N];
        for(int i=0;i<N;++i)a[i]=scan.nextLong();
        List<Long> evenSum = new ArrayList<>();
        List<Long> oddSum = new ArrayList<>();
        for(int i=0;i<N;++i){
            if(i==0)evenSum.add(a[i]);
            else if(i==1)oddSum.add(a[i]);
            else if(i%2==0)evenSum.add(evenSum.get(evenSum.size()-1)+a[i]);
            else oddSum.add(oddSum.get(oddSum.size()-1)+a[i]);
        }
        long ans = 0;
        int maxIndex=0;
        int minIndex=0;
        if(getmax(evenSum) < getmax(oddSum)){
            ans = getmax(oddSum);
            long index = getIndex(oddSum, ans);
            maxIndex = (int)(index/1000000)*2+2;
            minIndex = (int)(index%1000000)*2+1;
        }
        else{
             ans = getmax(evenSum);
             long index = getIndex(evenSum, ans);
             maxIndex=(int)(index/1000000)*2+1;
             minIndex=(int)(index%1000000)*2;
        }
        System.out.println(ans);
        List<Integer> list = new ArrayList<>();
        for(int i=N;i>maxIndex;--i)list.add(i);
        for(int i=0;i<minIndex;++i)list.add(1);
        for(int i=minIndex;i<maxIndex-1;i+=2)list.add(2);
        System.out.println(list.size());
        for(int i : list)System.out.println(i);

    }
}