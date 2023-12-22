import java.util.*;
public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int N =sc.nextInt();
        ArrayList<Integer> List = new ArrayList<>();
        for(int i=0;i<N;i++) List.add(sc.nextInt());
        int max = Collections.max(List);
        int opt=0;
        for(int i=max;i>0;i--){
            int num=0;
            for(int j:List) if(j%i!=0)num++;
            if(num<=1) {
                opt = i;
                break;
            }
        }
        System.out.println(opt);
    }
}