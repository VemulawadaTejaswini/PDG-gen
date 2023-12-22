import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();

        Map<Character,Integer> map = new HashMap<>();
        StringBuffer sb = new StringBuffer();
        for(int i=0 ;i<h;i++) {
            sb.append(sc.next());
        }
        System.out.println(sb);

        for(int i=0 ;i<h*w;i++){
            char c  =  sb.charAt(i);
            int count = map.getOrDefault(c,0);
            map.put(c,count+1);
        }


        int need4 = (h/2)*(w/2);
        int need1 = 0;
        if((h%2 == 1) && (w%2 == 1)){
            need1=1;
        }

        int need2 = 0;
        if(h%2==1){
            need2+=w/2;
        }

        if(w%2==1){
            need2+=h/2;
        }

        int map4 = 0;
        int map2 = 0;
        int map1 = 0;

        Set<Character> charUniq = map.keySet();

        for(Character c : charUniq){
            int count = map.get(c);
            map4 += count/4;
            count = count%4;
            map.put(c,count);

        }

        for(Character c : charUniq){
            int count = map.get(c);
            map2 += count/2;
            count = count%2;
            map.put(c,count);
        }

        for(Character c : charUniq){
            int count = map.get(c);
            if(1 == count){
                map1 += 1;
            }
        }

        System.out.println(map1);
        System.out.println(map2);
        System.out.println(map4);

        System.out.println(need1);
        System.out.println(need2);
        System.out.println(need4);


        //////

        map4 = map4 - need4;
        if(map4 < 0 ){
            System.out.print("No");
            return;
        }

        map2 += map4 * 2;
        map2 = map2 - need2;
        if(map2 < 0){
            System.out.print("No");
            return;
        }

        if(map2 == 0 && map1==need1){
            System.out.print("Yes");
            return;
        }
        System.out.print("No");

    }
}