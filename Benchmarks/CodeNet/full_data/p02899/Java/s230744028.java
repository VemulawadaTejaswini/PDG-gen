import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        HashMap<Integer,Integer>dic=new HashMap<>();
        Integer a[]=new Integer [N];
        for(int i=0;i<N;i++){
            a[i]=sc.nextInt();
            dic.put(a[i],i+1);
        }
        for(Integer value:dic.values()){
            System.out.println(value);
        }
    }
}