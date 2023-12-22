import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N,M;
        Map<String,Integer> list = new HashMap<>();
        N = sc.nextInt();
        for(int a=0;a<N;a++){
            String s = sc.next();
            if(list.containsKey(s)!=true) list.put(s,1);
            else{
                int num = list.get(s)+1;
                list.remove(s);
                list.put(s,num);
            }
        }
        M =sc.nextInt();
        for(int a=0;a<M;a++){
            String s = sc.next();
            if(list.containsKey(s)!=true) list.put(s,1);
            else{
                int num = list.get(s) -1;
                list.remove(s);
                list.put(s,num);
            }
        }
        int price = Collections.max(list.values());
        if(price>0) System.out.println(price);
        else System.out.println(0);
         }
}