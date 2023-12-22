import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();//3
        int box = a;
        int b = sc.nextInt();//2
        int t = sc.nextInt();//9
        int count = 1;
        t += 1;//t=10
        //int count = 0;
        ArrayList<Integer> time = new ArrayList<>();
        while(a < t){//3<10T,6<10T,9<10T
            time.add(a);
            a *= count;
            count++;
        }//time=3,6
        a = box;
        if(a > t){
            System.out.println((time.size()) * b);
        }else{
            System.out.println(0);
        }
    }
}