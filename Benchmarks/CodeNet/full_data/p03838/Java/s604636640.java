import java.util.Scanner;

public class Main{
    static int calc(int init, int goal){
        if(goal * init < 0){
            return Math.abs(goal + init) + 1;
        }
        else if(init > 0 && goal > 0){
            int ret;
            if(init > goal){
                ret = init - goal + 2;
            }else{
                ret = goal - init;
            }
            return ret;
        }else{
            return calc(-goal, -init);
        }
            
    }

    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().totalMemory());
        Scanner sc = new Scanner(System.in);
        System.out.println(Runtime.getRuntime().totalMemory());
        int init;
        int goal;
        init = Integer.parseInt(sc.next());
        goal = Integer.parseInt(sc.next());
        sc.close();
        System.gc();
        System.out.println(Runtime.getRuntime().totalMemory());

        System.out.println(calc(init, goal));
        
    }
}