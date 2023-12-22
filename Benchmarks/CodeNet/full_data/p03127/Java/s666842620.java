import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int N = sc.nextInt();
        ArrayList<Integer> List = new ArrayList<>();
        int min = 1000000000;
        int gusu =0;
        for(int a=0;a<N;a++){
            int input = sc.nextInt();
            List.add(input);
            if(input%2==0)gusu++;
        }
        if(gusu==N) System.out.println(Collections.min(List));
        else{
            for(int a=0;a<N;a++){
                for(int b=a+1;b<N;b++){
                    if(List.get(a)%2==0) break;
                    int num = List.get(b)%List.get(a);
                    num = Math.abs(num-List.get(a));
                    if(num<min) min =num;
                }
            }
            System.out.println(min);
        }

    }
}
