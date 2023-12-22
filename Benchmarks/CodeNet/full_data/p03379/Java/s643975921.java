import java.util.*;

public class Main {

    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        HashMap<Integer,Integer> map = new HashMap();
        for (int i=0;i<N;i++){
            map.put(i,sc.nextInt());
        }
        for (int i=0;i<N;i++){
            int tmp =map.get(i);
            map.remove(i);
            List <Integer> list = new ArrayList<>(map.values());
            Collections.sort(list);
            System.out.println(list.get(N/2-1));
            map.put(i,tmp);
        }
    }
}