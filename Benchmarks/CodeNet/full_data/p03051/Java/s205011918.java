import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,3};

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        StringBuilder sb = new StringBuilder();

        for(int i=0;i<n;i++){
            int a = sc.nextInt();
            sb.append(a);
        }

        
        Map<Integer,Integer> map = new HashMap<>();

        substring(sb.toString(), map);

        System.out.println("Iterating map");

        int count = 0;

        for(int i: map.keySet()){
            System.out.println(map.get(i));

            if(map.get(i)>1)
                count += map.get(i);
        }

        if(count == 0)
            count++;

        System.out.println("count = " + count);
    }

    private static void substring(String str, Map<Integer,Integer> map){

        String ss = str.substring(0,1);
        int res = Integer.valueOf(ss);

        for(int i=0;i<str.length();i++){
            for(int j=i;j<=str.length();j++){
                String s = str.substring(i,j);

                if(s.length() == 0)
                    continue;

                int r = xor(s);

                if(map.containsKey(r)){
                    int v = map.get(r);
                    map.put(r,v+1);
                }
                else{
                    map.put(r,1);
                }

                System.out.println(s);

            }
        }
    }

    private static int xor(String str){

        int res = Integer.parseInt(str.substring(0,1));

        for(int i=1;i<str.length();i++){
            int n = Integer.parseInt(str.substring(i,i+1));
            res = res ^ n;
        }

        return res;
    }

}
