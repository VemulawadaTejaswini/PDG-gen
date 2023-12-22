import java.util.*;
import java.util.AbstractMap.SimpleEntry;

public class Main{
        public static void main(String[] args){
                try(Scanner sc = new Scanner(System.in)){
                        int N = sc.nextInt(), K = sc.nextInt();
                        List<SimpleEntry<Integer, Integer>>ab = new ArrayList<SimpleEntry<Integer, Integer>>(N);
                        for(int i = 0; i < N; i++){
                                ab.add(new SimpleEntry<Integer, Integer>(sc.nextInt(), sc.nextInt()));
                        }
                        Collections.sort(ab, new Comparator<SimpleEntry<Integer, Integer>>(){
                                @Override
                                public int compare(SimpleEntry<Integer, Integer>x, SimpleEntry<Integer,Integer>y){
                                        return x.getKey() - y.getKey();
                                }
                        });
                        int i = 0;
                        while(K>0){
                                K-=ab.get(i).getValue();
                                i++;
                        }
                        i--;
                        System.out.println(ab.get(i).getKey());
                }
        }
}