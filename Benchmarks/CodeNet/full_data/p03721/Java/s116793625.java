import java.util.*;
import java.util.AbstractMap.SimpleEntry;

public class Main{
        public static void main(String[] args){
                try(Scanner sc = new Scanner(System.in)){
                        int N = sc.nextInt();
                        long K = sc.nextLong();
                        List<SimpleEntry<Long, Long>>ab = new ArrayList<SimpleEntry<Long, Long>>(N);
                        for(int i = 0; i < N; i++){
                                ab.add(new SimpleEntry<Long, Long>(sc.nextLong(), sc.nextLong()));
                        }
                        Collections.sort(ab, new Comparator<SimpleEntry<Long, Long>>(){
                                @Override
                                public int compare(SimpleEntry<Long, Long>x, SimpleEntry<Long,Long>y){
                                        return (int)(x.getKey() - y.getKey());
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