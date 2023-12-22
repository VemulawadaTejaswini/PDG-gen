
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        List<Rest> list1 = new ArrayList<>();
        List<Rest> list = new ArrayList<>();
        for(int i=0;i<n ;i++){
            Rest rest = new Rest(sc.next(),sc.nextInt(),i+1);
            list.add(rest);
            list1.add(rest);
        }
        Collections.sort(list);
        int i=1;
        for(Rest r:list){
            System.out.println(r.id);
        }

    }
    static class Rest implements Comparable<Rest>{
        public  String name;
        public Integer score;
        public Integer id;
        public Rest(String name,Integer score,Integer id){
            this.name = name;
            this.score = score;
            this.id = id;
        }
        @Override
        public int compareTo(Rest o) {
            int c = this.name.compareTo(o.name);
            if(c == 0){
                return o.score.compareTo(this.score);
            }
            return c;
        }
    }
}
