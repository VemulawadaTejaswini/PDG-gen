import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        ArrayList<Integer> balls = new ArrayList<Integer>();
        Map<Integer, Integer> m = new HashMap<Integer, Integer>();

        for(int i = 0; i < n; i++){
            int tonyu = scan.nextInt();
            if(!(m.containsKey(tonyu))) m.put(tonyu, 1);
            else {
                int v = m.get(tonyu);
                v++;
                m.replace(tonyu, v);
            }
            balls.add(tonyu);
        }

        scan.close();

        if(m.size() == n){
            for(int i = 0; i < n; i++){
                System.out.println("0");
            }
        }

        else{
            int box = 0;
            int value = 0;
            int res = 0;
            for(int i = 0; i < n; i++){
                box = balls.remove(0);
                Set<Integer> Mapset = m.keySet();
                for (Iterator<Integer> val = Mapset.iterator(); val.hasNext();){
                    value = m.get(val.next());
                    if(val.equals((box))) value--;
                    res += value * (value - 1) / 2;
                }
                System.out.println(res);
            }
        }
    }
}