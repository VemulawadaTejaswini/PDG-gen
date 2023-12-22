import java.util.*;
 
public class Main {
    public static void sort(int array[], int array2[], int array3[], int left, int right){
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
                    
                    int tmp2 = array2[l];
                    array2[l] = array2[r];
                    array2[r] = tmp2;
                    
                    int tmp3 = array3[l];
                    array3[l] = array3[r];
                    array3[r] = tmp3;
                    l++;
                    r--;
                }
            }
            Main.sort(array, array2, array3, left, r);
            Main.sort(array, array2, array3, l, right);
        }
    }
    
    
    public static void main(String args[]){
        Scanner stdIn = new Scanner(System.in);
 
        int n = stdIn.nextInt();
        //int l = stdIn.nextInt();
        //int x = stdIn.nextInt();
        int left[] = new int[n];
        int right[] = new int[n];
        int len[] = new int[n];
        //String s = stdIn.next();
        //String t = stdIn.next();
        //char c[] = s.toCharArray();
        
        //c[0] += 1;
        //int sum = 0;
        //boolean flag = true;
        for(int i = 0; i < n; i++){
            int x = stdIn.nextInt();
            int l = stdIn.nextInt();
            left[i] = x - l + 1;
            right[i] = x + l - 1;
            len[i] = l - x;
            
        }
        
        sort(len, left, right, 0, len.length - 1);
        
        for(int i = 0; i <= 100000; i++){
            
        }
        
        System.out.println(n - 1);
        //System.out.println();
        //System.out.print();
 
        stdIn.close();
    }
}