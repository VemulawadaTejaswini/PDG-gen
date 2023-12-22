import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        HashMap<Integer,Integer> num=new HashMap<>();
        Scanner sc=new Scanner(System.in);
        int loop=sc.nextInt();
        for(int i=1;i<loop;i++){
            int a=sc.nextInt();
            if(num.containsKey(a)){
                num.put(a,num.get(a)+1);
            }
            else{
                num.put(a,1);
            }
        }
        for (int i=1;i<=loop;i++){
            if(num.containsKey(i)){
                System.out.println(num.get(i));
            }
            else {
                System.out.println(0);
            }
        }
    }
}
