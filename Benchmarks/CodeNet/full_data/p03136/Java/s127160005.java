import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int a[] =new int[N];
        int sum=0;
        for(int i=0;i<N;i++){
            a[i]=sc.nextInt();
        }
        
        Arrays.sort(a);
        
        for(int i=0;i<N-1;i++){
            sum+=a[i];
        }
        
        if(sum>a[N-1]){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
