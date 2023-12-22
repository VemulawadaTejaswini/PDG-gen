import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        int N =sc.nextInt();
        ArrayList<Integer> List = new ArrayList<>();
        int max=0,max2 =0,max_num=0;
        for(int i=0;i<N;i++) {
            int num = sc.nextInt();
            List.add(num);
            if(max==num) max_num++;
            if(max<num) max=num;
            if(max>num&&max2<num) max2=num;
        }
        for(int i=0;i<N;i++){
            if(List.get(i)==max&&max_num==0)System.out.println(max2);
            else if(List.get(i)==max&&max_num>0) System.out.println(max);
            else System.out.println(max);
        }
    }
}