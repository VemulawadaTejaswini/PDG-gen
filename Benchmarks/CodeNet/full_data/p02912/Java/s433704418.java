import java.util.*;

class Main{
    public static void main(String[] args) {       
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();
        int m = stdIn.nextInt();
        double a[] = new double[n];
        Arrays.setAll(a, i -> stdIn.nextInt());

        Arrays.sort(a);
        double max = a[0];
        double maxInd = 0;
        for(int i = 0; i < m; i++){
            for(int j =0; j < n; j++){
                if(max < a[j]){
                    max = a[j];
                    maxInd = j;
                } 
            }
            a[(int)maxInd] = a[(int)maxInd]/2;
            max = a[(int)maxInd];
            
        }
         
        long ans =0;
        for(int i = 0 ; i < n; i++){
            ans += (int)a[i];
        }
        System.out.println(ans);
   }
}