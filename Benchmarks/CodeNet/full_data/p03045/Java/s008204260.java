import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        Map<Integer,Boolean>map=new HashMap<>();
        for(int i=0;i<a;i++){
            map.put(i+1,false);
        }
        int count=0;
        for(int i=0;i<b;i++){
            int x=sc.nextInt();
            int y=sc.nextInt();
            sc.nextInt();
            if(!map.get(x)&&!map.get(y))
                    count++;
            if(map.get(x)&&map.get(y))count--;
            map.put(x,true);
            map.put(y,true);
        }
        for(Integer key:map.keySet()){
            if(!map.get(key)){
                count++;
            }
        }
        System.out.println(count);
    }
}