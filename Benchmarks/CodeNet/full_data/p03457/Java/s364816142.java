import java.util.*;

class Main{
    static Scanner sc = new Scanner(System.in);
    static StringBuffer sb = new StringBuffer();
    public static void main(String args[]){
        int N=sc.nextInt();
        TreeMap<Integer,Pair> plan=new TreeMap<>();
        plan.put(0,new Pair(0,0));
        for(int i=0;i<N;i++){
            plan.put(sc.nextInt(),new Pair(sc.nextInt(),sc.nextInt()));
        }
        int before=0,distance=0;
        String res="Yes";
        for(int key:plan.keySet()){
            distance=Math.abs(plan.get(key).a-plan.get(before).a)+Math.abs(plan.get(key).b-plan.get(before).b);
            if(key-before-distance<0||(key-before-distance)%2==1){
                res="No";
                break;
            }
        }
        System.out.println(res);
    }
}
class Pair{
    int a,b;
    public Pair(int a,int b){
        this.a=a;
        this.b=b;
    }
}
