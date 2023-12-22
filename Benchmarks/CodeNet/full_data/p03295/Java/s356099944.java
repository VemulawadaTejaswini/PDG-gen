import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int M=sc.nextInt();
        int N=sc.nextInt();
        int ANS=0;
        int[] START=new int[N];
        int[] END=new int[N];
        
        for(int i=0;i<N;i++){
            START[i]=sc.nextInt();
            END[i]=sc.nextInt();
        }
        
        Arrays.sort(START);
        Arrays.sort(END);
        
        for(int i=0;i<N;i++){
            System.out.println(START[i]+" "+END[i]);
        }
        
        int startidx=0;
        int endidx=0;
        boolean isStart=true;
        
        while(startidx<N&&endidx<N){
            if(START[startidx]<END[endidx]&&startidx<N){
                isStart=true;
                startidx++;
                continue;
            }else if(START[startidx]>=END[endidx]&&endidx<N){
                endidx++;
                if(isStart){
                    ANS++;
                }
                isStart=false;
            }
        }
        
        ANS++;
        
        System.out.println(ANS);
    }
}
