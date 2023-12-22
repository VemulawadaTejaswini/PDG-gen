import java.util.*;
public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> List = new ArrayList<>();
        ArrayList<Long> L = new ArrayList<>();
        int N = sc.nextInt();
        int M = sc.nextInt();
        L.add((long)1);
        L.add((long)1);
        for(int i=0;i<M;i++) List.add(sc.nextInt());
        List.add(0);
        for(int i=2;i<=N;i++){
            if(List.get(0)!=i) L.add(((L.get(i-1))+L.get(i-2))%1000000007);
            else{
                L.add((long)0);
                List.remove(0);
            }
        }
        System.out.println(L.get(N));
    }

}
