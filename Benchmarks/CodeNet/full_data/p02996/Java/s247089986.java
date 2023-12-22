
import java.util.*;


public class Main {

    private static final int INF = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Work> list = new ArrayList<>();
        for(int tmp = 0; tmp < n;tmp++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            Work work = new Work(a,b);
            list.add(work);
        }


        Collections.sort(list, new Comparator<Work>() {
            @Override
            public int compare(Work obj0, Work obj1) {
                if(obj0.time < obj1.time){
                    return -1;
                }else if(obj0.time > obj1.time){
                    return 1;
                }else{
                    return 0;
                }
            }
        });
        boolean result = true;
        long time = 0;
        for(int tmp = 0;tmp < n; tmp++){
            Work work = list.get(tmp);
            time += work.cost;
            if(time > work.time){
                result = false;
                break;
            }
        }

        if(result){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }


    }

    //最大公約数
    static class Work {
        public int cost;
        public int time;

        public Work(int a,int b){
            this.cost = a;
            this.time = b;
        }

    }
}
