import java.util.*;
import java.util.stream.Collectors;
//import java.io.*;
import java.util.stream.IntStream;


public class Main{
    static int sum=0;
    public static void main (String args[]){
        //初期処理
        Scanner sc=new Scanner(System.in);
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // try{
            // int n = Integer.parseInt(br.readLine());
            int N= sc.nextInt();
            int M=sc.nextInt();
            Bulb[] bulbs = new Bulb[M];
            int[] swArr = new int[N];
            Set<int[]> swSet = new HashSet<>();

            setSwPattern(swSet, swArr, 0);


            IntStream.range(0,M).forEach(i->{
                int n=sc.nextInt();
                bulbs[i]=new Bulb();
                for(int j=0;j<n;j++){
                    int m=sc.nextInt();
                    bulbs[i].sw.add(m);
                }
            });

            IntStream.range(0,M).forEach(i->bulbs[i].p=sc.nextInt());

            swSet.forEach(s->check(s,bulbs));
            System.out.println(sum);

    }

    static void check(int[] swArr, Bulb[] bulbs){

            Arrays.asList(bulbs).stream().forEach(s->{
                int swSum=0;
                for(int i=0;i<s.sw.size();i++){
                    swSum+=swArr[s.sw.get(i)-1];
                }
                if(s.p==(swSum%2)){
                    s.on=true;
                }else{
                    s.on=false;
                }
            });
            if(Arrays.asList(bulbs).stream().allMatch(s->s.on==true)){
                sum++;
            }
        
    }
    static void setSwPattern(Set<int[]> set,int[] swArr,int n){
        set.add(swArr);
        if(n<swArr.length){
        int cloneSwArr[]= swArr.clone();
        swArr[n]=0;
        setSwPattern(set,swArr,n+1);
        cloneSwArr[n]=1;
        setSwPattern(set,cloneSwArr,n+1);
        }
    }

    
}


class Bulb{
    Bulb(){};
    int p;
    Boolean on=false;
    List<Integer> sw = new ArrayList<>();

    void turn(){
        this.on=(this.sw.stream().reduce(0,Integer::sum)/2)==this.p;
    }

}