import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int box = a;
        int b = sc.nextInt();
        int t = sc.nextInt();
        t += 1;
        int count = 0;
        ArrayList<Integer> time = new ArrayList<>();
        time.add(a);
        for(int i = 1; i < b;i++){
            a = a * 2;
            time.add(a);
        }
        a = box;
        if(a < t){
            for(int i : time){
                if(i >= t){
                    break;
                }
                ++count;
            }
        }
        System.out.println(b * count);
    }
}