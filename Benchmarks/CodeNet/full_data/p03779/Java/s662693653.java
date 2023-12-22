import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int cur = 0;
        int time = 0;
        while(cur < x){
            time++;
            System.out.println(" t : " + time + " cur : " + cur);
            if((x-cur) <= time || (x - cur) >= 2*time){
                cur = cur+time;
            }
        }
        System.out.println(time);
    }
}

