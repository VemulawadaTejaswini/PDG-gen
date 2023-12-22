import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int N = sc.nextInt();
        ArrayList<Integer> List = new ArrayList<>();
        int min = 1000000000;
        for(int a=0;a<N;a++) List.add(sc.nextInt());
        for(int a=0;a<N;a++){
            for(int b=a+1;b<N;b++){
                int num = List.get(b)%List.get(a);
                num = Math.abs(num-List.get(a));
                if(num<min) min =num;
            }
        }
        System.out.println(min);
    }
}
