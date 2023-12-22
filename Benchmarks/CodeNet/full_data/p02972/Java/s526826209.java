import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        int N =sc.nextInt();
        ArrayList<Integer> List = new ArrayList<>();
        int opt [] = new int[N];
        int num_list [] = new int[N];
        int opt_num =0;
        for(int i=0;i<N;i++){
            List.add(sc.nextInt());
            num_list[i]=0;
        }
        for(int i=List.size()-1;i>=0;i--){
            if((i+1)*2>N){
                num_list[i]=List.get(i);
                opt[i]=List.get(i);
                if(List.get(i)!=0){
                    opt_num++;
                    for(int j=i-1;j>=0;j--){
                        if((i+1)%(j+1)==0) num_list[j]++;
                    }
                }
            }
            else{
                if(num_list[i]%2==List.get(i))opt[i]=0;
                else {
                    opt_num++;
                    opt[i]=1;
                }
            }
        }
        if(opt[0]%2==List.get(0)){
            System.out.println(opt_num);
            for(int i=0;i<N;i++){
                if(opt[i]==1) System.out.print(i+1+" ");
            }
            System.out.println();
        }
        else System.out.println("-1");


    }
}