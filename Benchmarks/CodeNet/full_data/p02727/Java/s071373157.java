import java.util.*;

class Apple implements Comparable<Apple>{
    @Override
    public int compareTo(Apple apple){
        return apple.deli - this.deli;
    }

    int color;
    int deli;
    boolean use;

    public Apple(int color, int deli){
        this.color = color;
        this.deli = deli;
    }
}

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        PriorityQueue<Apple> qa = new PriorityQueue<>();
        PriorityQueue<Apple> qb = new PriorityQueue<>();
        List<Apple> qc = new ArrayList<>();

        for(int i = 0; i < a; i++){
            qa.add(new Apple(1, sc.nextInt()));
        }
        for(int i = 0; i < b; i++){
            qb.add(new Apple(2, sc.nextInt()));
        }
        for(int i = 0; i < c; i++){
            qc.add(new Apple(0, sc.nextInt()));
        }
        for(int i = 0; i < c; i++){
            Apple ap = qc.get(i);
            qa.add(ap);
            qb.add(ap);
        }

        int ans = 0;
        Apple ap = qa.poll();
        Apple bp = qb.poll();

        while(x + y > 0){
            //System.out.println(x +" "+ y);
            if(ap.deli > bp.deli || y == 0){
                if(x > 0){
                    if(ap.color == 0){
                        if(ap.use){
                            continue;
                        }else{
                            ap.use = true;
                        }
                    }
                    //System.out.println(ap.deli);
                    ans += ap.deli;
                    ap = qa.poll();
                    x--;
                }
            }else{
                if(y > 0){
                    if(bp.color == 0){
                        if(bp.use){
                            continue;
                        }else{
                            bp.use = true;
                        }
                    }
                    //System.out.println(bp.deli);
                    ans += bp.deli;
                    bp = qb.poll();
                    y--;
                }
            }

        }

        System.out.println(ans);
    }
}
