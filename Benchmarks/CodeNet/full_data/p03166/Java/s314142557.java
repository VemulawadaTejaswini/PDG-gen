import java.util.*;
public class Main {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        Map<Integer,ArrayList<Integer>> Link = new HashMap<>();
        Set<Integer> Node = new HashSet<>();
        for(int i=0;i<M;i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            if(Link.get(x)==null){
                ArrayList<Integer> L = new ArrayList<>();
                L.add(y);
                Link.put(x,L);
            }
            else Link.get(x).add(y);
            Node.add(x);
        }
        int max = 0;
        for(int i:Node){
            int num = LP(Link,i,0,0);
            if(max<num) max = num;
        }
        System.out.println(max);
    }
    public static int LP(Map<Integer,ArrayList<Integer>> L,int source,int max,int d){
        if(L.get(source)!=null){
            for(int i:L.get(source)){
                int num = d+1;
                max = LP(L,i,max,num);
            }
        }
        if(d>max)max = d;
        return max;
    }
}