
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Main {
    static int n,k;
    static String line;
    static List<Long> nums;
    public static void main(String args[]){
        String[] input=A0();

        String strs[]=line.split(" ");

        nums=new ArrayList<Long>(strs.length);

        for (int i = 0; i <strs.length ; i++) {
            nums.add(Long.parseLong(strs[i]));
        }
        Collections.sort(nums);

        Long result=0L;
        for (int i = 0; i <nums.size() ; i++) {
            int minInd=(i);
            for (int j = 0; j <nums.size() ; j++) {

                int maxInd=(nums.size()-1-j);

                int n=maxInd-minInd+1;//選択対称の数
                if(n<k){
                    break;
                }
                int times=calcNumOfCombination(n-2,k-2);
                long add=calc(nums.get(maxInd),nums.get(minInd))*times;
                result+=add;
                result%=1000000000+7;
            }
            int n=nums.size()-1-minInd;
            if(n<k){
                break;
            }
        }
        System.out.println(result);



    }
    static Map<String,Integer> cache=new HashMap<>();
    //組み合わせの数nCrを計算
    static int calcNumOfCombination(int n, int r){
        String key=""+n+" "+r;
        if(cache.containsKey(key)){
            return cache.get(key);
        }
        int num = 1;
        for(int i = 1; i <= r; i++){
            num = num * (n - i + 1) / i;
        }
        cache.put(key,num);
        return num;
    }

    public  static long  calc(long max, long min){
       return max-min;
    }




    public static String[] A0(){

        int i=0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String nm=reader.readLine();
            String[] sp=nm.split(" ");
            n=Integer.parseInt( sp[0]);
            k=Integer.parseInt( sp[1]);

            String ret=reader.readLine();
            line=ret;
            reader.close();



        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;

    }
}