import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        StringBuilder sb = new StringBuilder();

        for(int i=0;i<n;i++){
            int a = sc.nextInt();
            sb.append(a);
        }


        Map<Integer,Set<String>> map = new HashMap<>();

        substring(sb.toString(), map);

        //System.out.println("Iterating map");

        int count = 0;

        for(int i: map.keySet()){
            //System.out.println(map.get(i));

            if(map.get(i).size()>1){
                count += map.get(i).size();
            }

        }

        if(count == 0)
            count++;

        System.out.println(count);
    }

    private static void substring(String str, Map<Integer,Set<String>> map){

        String ss = str.substring(0,1);
        int res = Integer.valueOf(ss);

        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<=str.length();j++){
                String s = str.substring(i,j);

                if(s.length() == 0)
                    continue;

                int r = xor(s);

                if(map.containsKey(r)){
                    Set<String> set = map.get(r);
                    set.add(s);
                    map.put(r,set);
                }
                else{
                    Set<String> set = new HashSet<>();
                    set.add(s);
                    map.put(r,set);
                }

                //System.out.println(s);

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
