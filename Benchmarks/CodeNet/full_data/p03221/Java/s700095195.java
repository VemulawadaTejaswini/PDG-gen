import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        HashMap<Integer,ArrayList<City>> map = new HashMap<Integer,ArrayList<City>>();
        String[] ans = new String[m];
        for(int i = 0; i < m; i++){
            int p = sc.nextInt();
            if(map.containsKey(p)){
                map.get(p).add(new City(sc.nextInt(), i));
            }else{
                ArrayList<City> tmp = new ArrayList<City>();
                tmp.add(new City(sc.nextInt(), i));
                map.put(p,tmp);
            }
        }
        for(Map.Entry<Integer,ArrayList<City>> e : map.entrySet()){
            int p = e.getKey();
            ArrayList<City> v = e.getValue();
            if(v.size() != 1){
                Collections.sort(v);
            }
            int index = 1;
            for(City c : v){
                ans[c.index] = String.format("%06d",p) + String.format("%06d",index);
                index++;
            }
        }
        for(String s : ans){
            System.out.println(s);
        }
    }
}

class City implements Comparable<City>{
    int y,index;
    public City(int y, int i){
        this.y = y;
        this.index = i;
    }
    
    public int compareTo(City c){
        if(this.y < c.y){
            return -1;
        }else if(this.y > c.y){
            return 1;
        }else{
            return 0;
        }
    }
}