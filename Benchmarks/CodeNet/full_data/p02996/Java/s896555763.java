//package Atcoder131;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        List<MapElement> list = new ArrayList<>();
        while(N>0){
            list.add(new MapElement(s.nextLong(),s.nextLong()));
            N--;
        }
        list.sort(new Comparator<MapElement>() {
            @Override
            public int compare(MapElement o1, MapElement o2) {
                return o1.v < o2.v ? -1 : 1;
            }
        });
        long sum=0;
        for(int i=0;i<list.size();i++){
            sum+=list.get(i).k;
            if(sum <= list.get(i).v){
                continue;
            }else{
                System.out.println("No");
                System.exit(0);
            }
        }
        System.out.println("Yes");
    }
}

class MapElement {
    public long k;
    public long v;
    MapElement(long k , long v){
        this.k= k;
        this.v= v;
    }
}
