import java.util.*;

public class Main {
    public static int abs(int a){
        return (a>0)?a:(-a);
    }
    
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[] A=new int[N];
        boolean[] isSelected=new boolean[N];
        long[] leftmove=new long[N];
        long[] rightmove=new long[N];
        
        for(int i=0;i<N;i++){
            A[i]=sc.nextInt();
            isSelected[i]=false;
            leftmove[i]=A[i]*i;
            rightmove[i]=A[i]*(N-1-i);
        }
        
        int leftidx=0;
        int rightidx=N-1;
        long ans=0;
        
        for(int i=0;i<N;i++){
            long leftmax=-1;
            int leftmaxidx=0;
            long rightmax=-1;
            int rightmaxidx=0;
            for(int j=0;j<N;j++){
                if(leftmax<leftmove[j]&&!isSelected[j]){
                    leftmax=leftmove[j];
                    leftmaxidx=j;
                }
                if(rightmax<rightmove[j]&&!isSelected[j]){
                    rightmax=rightmove[j];
                    rightmaxidx=j;
                }
            }
            if(rightmax>leftmax){
                ans+=rightmax;
                rightidx--;
                isSelected[rightmaxidx]=true;
                for(int j=0;j<N;j++){
                    rightmove[j]=A[j]*abs(rightidx-j);
                }
            }else{
                ans+=leftmax;
                leftidx++;
                isSelected[leftmaxidx]=true;
                for(int j=0;j<N;j++){
                    leftmove[j]=A[j]*abs(j-leftidx);
                }
            }
        }
        System.out.println(ans);
    }
}
