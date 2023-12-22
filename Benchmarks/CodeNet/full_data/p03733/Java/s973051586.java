import java.util.*;

class Main{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ninzu = sc.nextInt();
        int outTime = sc.nextInt();
        List<Integer> comeTime = new ArrayList<>();

        int endTime = 0;
        int sumTime = 0;


        for(int i = 0; i < ninzu; i ++) {
            int time = sc.nextInt();
            comeTime.add(time);
        }

        for(int time : comeTime) {
            int tmpTime = 0;
            if (endTime > time) tmpTime = endTime - time;
            
            endTime = time + outTime;
            sumTime = sumTime + outTime - tmpTime;
        }

        System.out.println(sumTime);
    }
}


