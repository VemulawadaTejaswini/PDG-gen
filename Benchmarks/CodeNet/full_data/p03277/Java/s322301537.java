import java.util.*;
import java.io.*;

class Counter<T>{
    Map <T,Integer> counter;
    public Counter(){
        counter = new HashMap<>();
    }
    public void add(T elm){
        counter.put(elm, counter.getOrDefault(elm,0)+1);
    }
    public Integer get(T elm){
        return counter.getOrDefault(elm,0);
    }
    public void clear(){
        counter.clear();
    }
    public Set<T> keySet(){
        return counter.keySet();
    }
}

public class Main {
    public static int maxOfArray(int[] array){
        int ans = array[0];
        for(int i=1;i<array.length;i++)
            if(ans<array[i]) ans=array[i];
        return ans;
    }
    public static int minOfArray(int[] array){
        int ans = array[0];
        for(int i=1;i<array.length;i++)
            if(ans>array[i]) ans=array[i];
        return ans;
    }
    
    //return true when the answer is larger than curAns
    public static boolean checkAns(int curAns, int[] array){
        int N = array.length;
        boolean[] booled = new boolean[N];
        for(int n=0;n<N;n++)
        	booled[n] = (array[n]<=curAns);
        
        int[] sum = new int[N+1];
        sum[0]=0;
        for(int n=1;n<=N;n++) sum[n] = sum[n-1] + (booled[n-1]?-1:1);
        Counter<Integer> counter = new Counter<Integer>();
        counter.add(0);
        
        long ans = 0;
        for(int n=1;n<=N;n++){
        	for(int x: counter.keySet()){
        	    if(sum[n]>=x) ans += counter.get(x);
        	}
        	counter.add(sum[n]);
        }
        //System.out.println(ans);//
        return ans < N*(N+1)/4;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
        for(int n=0;n<N;n++) a[n]=sc.nextInt();
        int ansMax = maxOfArray(a);
        int ansMin = minOfArray(a);
        
        while(ansMax>ansMin){
        	//System.out.print(ansMax+" "+ansMin+ " : ");//
        	int curAns = (ansMax+ansMin)/2;
        	//System.out.println(curAns);//
        	if(checkAns(curAns,a)) ansMax=curAns;
        	else ansMin=curAns+1;
        }
        System.out.println(ansMax);
        
    }
}