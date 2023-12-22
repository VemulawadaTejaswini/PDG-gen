import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
 
         Triangle tr = new Triangle(N);
         
        for(int i = 0; i < N; i++){
            tr.L[i] = sc.nextInt();   
        }
        
        System.out.println(tr.triangleTotal());
        
    }
}

class Triangle {
    
    int[] L;
    int N;
    
    public Triangle(int N){
        this.N = N;
        L = new int[N];
    }
    
    public int triangleTotal(){
        Arrays.sort(L);
        int triangleTotal = 0;
        
        for(int i = 0; i < N -2; i++){
            for(int j = i + 1; j < N - 1; j++){
                for(int k = j + 1; k < N; k++){
                    if(judgeTriangle(i, j, k)){
                        triangleTotal++;
                    }else{
                        break;
                    }  
                }

            }
        }
        return triangleTotal;
    }
    
    private boolean judgeTriangle(int a, int b, int c){
        return (L[c] < L[a] + L[b]) && (L[a] < L[b] + L[c]) && (L[b] < L[a] + L[c]);
    }
    
    
    
}
