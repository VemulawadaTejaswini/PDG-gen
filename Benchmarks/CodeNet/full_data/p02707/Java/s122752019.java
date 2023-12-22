import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        ArrayList<Integer> num =new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        int loop=sc.nextInt();
        for(int i=1;i<loop;i++){
            int a=sc.nextInt();
            num.add(a);
        }
        for(int n=1;n<=loop;n++){
        
            int t=0;
            for(int i=0;i<loop-1;i++){
                if(num.get(i)==n){
                    t++;
                }
            }

            System.out.println(t);
        }
    }
}
