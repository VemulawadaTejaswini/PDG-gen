import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N =sc.nextInt();
        ArrayList<Integer> List = new ArrayList<>();
        int num_list [] = new int[N];
        ArrayList<Integer> OPT = new ArrayList<>();
        int opt_num =0;
        for(int i=0;i<N;i++){
            int num=sc.nextInt();
            List.add(num);
            if(num==0) num_list[i]=0;
            else{
                for(int j=i;j>=0;j--){
                    if((i+1)%(j+1)==0) {
                        num_list[j]++;
                    }
                }
            }
        }
        for(int i=0;i<N;i++){
            if((i+1)*2<=N){
                if((num_list[i]%2)!=List.get(i)){
                    OPT.add(i+1);
                    opt_num++;
                }
                else if(num_list[i]==1&&List.get(i)==1){
                    OPT.add(i+1);
                    opt_num++;
                }
            }
            else if(List.get(i)==1) {
                OPT.add(i+1);
                opt_num++;
            }
        }
        System.out.println(opt_num);
        for(int i=0;i<OPT.size();i++){
            System.out.print(OPT.get(i));
            if(i<N-1) System.out.print(" ");
        }
        System.out.println();
    }
}
