import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.nextLine();
        Map<String,Integer> map1 = new HashMap<>();
        Map<String,Integer> map2 = new HashMap<>();
        String[] x = new String[a];
        for(int i =0;i<a;i++){
            String b = sc.nextLine();
            x[i] = b;
            if(map1.get(b) != null){
                map1.put(b,map1.get(b)+1);
            }else{
                map1.put(b,1);
            }
        }
        int c = sc.nextInt();
        sc.nextLine();
        for(int i =0;i<c;i++){
            String d = sc.nextLine();
            if(map2.get(d) != null){
                map2.put(d,map2.get(d)+1);
            }else{
                map2.put(d,1);
            }
        }
        int max = 0;

        //map1からmap2を引いたものの最大値をmaxに代入
        for(int i = 0;i<a;i++){
            int y = map1.get(x[i]);
            int z = 0;
            if(map2.get(x[i]) != null){
                z = map2.get(x[i]);
            }
            max = Math.max(max,y-z);
        }
        System.out.println(max);
    }
}