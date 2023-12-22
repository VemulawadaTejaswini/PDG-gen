import java.util.*;

public class Main {
    
    static int[] measureDistance(int x,int y,int[] arrx, int[] arry){
        int[] arrDistance = new int[arrx.length];
         for(int i = 0; i < arrx.length; i++) {
            int dx = x - arrx[i];
            int dy = y - arry[i];
            if(dx < 0){
                dx = -1 * dx;
            }
            if(dy < 0){
                dy = -1 * dy;
            }
            arrDistance[i] = dx + dy;
        }
         return arrDistance;
    }
    static int indexOf(int[] a){
        int min = a[0];
        for(int i = 1; i < a.length; i++){
            if(a[i] < min) min = a[i];
        }
        
        int index = 0;
        
        for(int i = 0; i < a.length; i++) {
            if(a[i] == min){
                index = i;
                i = a.length;
            }
        }
        return index;
    } 
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); //Number of Students
        int M = sc.nextInt(); //Number of checkpoint
        
        int[] arrStudentsX = new int[N];
        int[] arrStudentsY = new int[N];
        for(int i = 0; i < N; i++) {
            arrStudentsX[i] = sc.nextInt();
            arrStudentsY[i] = sc.nextInt();
        }
        
        int[] arrCheckpointX = new int[M];
        int[] arrCheckpointY = new int[M];
        for(int i = 0; i < M; i++) {
            arrCheckpointX[i] = sc.nextInt();
            arrCheckpointY[i] = sc.nextInt();
        }
        
        int[] result = new int[N];
        for(int i = 0; i < N; i++){
            int x = arrStudentsX[i];
            int y = arrStudentsY[i];
            int[] arr = measureDistance(x,y,arrCheckpointX,arrCheckpointY);
            result[i] = indexOf(arr) + 1;
        }
        
        for(int i = 0; i < N; i++){
            System.out.println(result[i]);
        }
        
    }
    
}