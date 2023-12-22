import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        
        int N = Integer.parseInt(sc.nextLine());
        int A[] = new int[N];
        int Ans[] = new int[N];
        
        for(int i=0; i<N; i++){
            Ans[i]=i;
            A[i] = Integer.parseInt(sc.next());
            //System.out.println("生徒"+(Ans[i]+1)+"登校時点の人数:"+A[i]+"人");
        }
        
        int tmp=0;
        int tmp2=0;
        for(int i=0; i<N; i++){
            for(int j=N-1; j>i; j--){
                if(A[j]<A[j-1]){
                    tmp=A[j];
                    A[j]=A[j-1];
                    A[j-1]=tmp;
                    
                    tmp2=Ans[j];
                    Ans[j]=Ans[j-1];
                    Ans[j-1]=tmp2;
                }
            }
        }
        for(int i=0; i<N; i++){
            System.out.print((Ans[i]+1)+" ");
        }
    }
}
