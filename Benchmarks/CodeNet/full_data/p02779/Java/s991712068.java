import java.util.*;

public class Main {
       public static void sort(int array[], int left, int right){
        if(left <= right){
            int p = array[(left + right) >>> 1];
            int l = left;
            int r = right;
            while(l <= r){
                while (array[l] < p){
                    l++;
                }
                while (array[r] > p){
                    r--;
                }
                if (l <= r){
                    int tmp = array[l];
                    array[l] = array[r];
                    array[r] = tmp;

                    l++;
                    r--;
                }
            }
            Main.sort(array, left, r);
            Main.sort(array, l, right);
        }
    }
    
    public static void main(String[] args) throws Exception {
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();
        int a[] = new int[n];
        boolean flag = true;
        
        for(int i = 0; i < n; i++){
            a[i] = stdIn.nextInt();
        }
        
        sort(a, 0, n - 1);
        
        for(int i = 1; i < n; i++){
            if(a[i - 1] == a[i]){
                flag = false;
                break;
            }
        }
        
        if(flag){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
        
    }
}
