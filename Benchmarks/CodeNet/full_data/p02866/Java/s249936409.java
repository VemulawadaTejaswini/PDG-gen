import java.util.*;
public class Main {
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long [] List = new long[N];
        long opt=1;
        long max = 0;
        for(int i=0;i<N;i++) {
            int num = sc.nextInt();
            if(max<num) max = num;
            List[num]++;
        }
        if(List[0]!=0){
            for(int i=1;i<max;i++){
                if(List[i]!=0&&List[i+1]!=0){
                    long num2 = 1;
                    for(int j=0;j<List[i+1];j++) num2*=List[i];
                    opt*=num2;
                    opt%=998244353;
                }
                else{
                    opt = 0;
                    break;
                }
            }

        }
        else opt=0;
        System.out.println(opt);
    }
}