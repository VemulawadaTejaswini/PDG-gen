import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int N = sc.nextInt();
        ArrayList<Integer> List = new ArrayList<>();
        int num2=0;
        for(int a=0;a<N;a++){
            int num = sc.nextInt();
            List.add(num);
            if(num%2==0) num2++;
        }
        if(num2==N) System.out.println(Collections.min(List));
        else{
            int max = Collections.max(List);
            int min= 1000000000;
            int min_num=0;
            for(int a=0;a<N;a++){
                int amari = max%List.get(a);
                if(amari<min&&amari!=0){
                    min =amari;
                    min_num=a;
                }
            }
            if(List.get(min_num)>min)min = Math.abs(min-List.get(min_num));
            System.out.println(min);
        }
    }
}