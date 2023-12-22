import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] P = new int[n];
        int s = 0;
        int maxs= 0;
        int ans=0;
        for(int i = 0;i<n;i++){
            P[s] = scan.nextInt();
        
            s+=1;
        }
        
        s= 0;
        maxs = P[0];
        for(int i=0;i<n;i++){
            int r = P[i];
            if(r>maxs){
                maxs =r;
            }
    
        }
        for(int i=0;i<n;i++){
            ans += P[i];
        

        }
        
        System.out.println(ans-maxs+(maxs/2));
        
    }

}