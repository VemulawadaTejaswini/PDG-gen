import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        boolean ans = true;
        int num = 0;

        for(int i = 0; i < m ; i++){
            int k = scan.nextInt();
            int v = scan.nextInt();

            if(map.containsKey(k)){
                if(!(map.get(k).equals(v))) ans = false;
            }
            else if(n > 1 && k == 1 && v == 0){ans = false; break;}
            else{
                map.put(k,v);
            }
        }

        scan.close();

        if(ans){
            for(int j = 0; j < n; j++){
                if(map.containsKey(j)){
                    int k = (int)map.get(j);
                    if(j == 0) num += k * 100;
                    else if(j == 1) num += k * 10;
                    else num += k;
                }
            }

            System.out.println(num);
        }
        else System.out.println("-1");
    }
}