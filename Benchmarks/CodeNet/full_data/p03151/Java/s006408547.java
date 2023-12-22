import java.util.*;
public class Main{
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] A = new int[N];
        int Ago=0;
        int Bgo = 0;
        int ans=0;
        for(int i=0;i<N;i++){
            A[i] = scan.nextInt();
        }
        for(int i=0;i<N;i++){
            int B = scan.nextInt();
            if(A[i]==B){
                A[i]=0;
            }else if(A[i]>B){
                A[i]-=B;
            }else{
                ans++;
                Bgo=Bgo+(B-A[i]);
                A[i]=0;
            }
        }
        Arrays.sort(A);
        int p=1;
        int sub=0;
        int y=0;
        if(Bgo!=0){
            while (true) {
                y = A[A.length-p];
                if(y==0){ans=-1;break;}
                sub+=y;
                ans++;
                if(sub>Bgo){
                    break;
                }
                p++;
                if(p>A.length){ans=-1;break;}
            }
        }
        System.out.println(ans);
	}
}