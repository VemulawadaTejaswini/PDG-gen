import java.util.*;
 
public class Main {
    public static void sort(int array[], int array2[], int left, int right){
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
                    l++;
                    r--;
                }
            }
            Main.sort(array, array2, left, r);
            Main.sort(array, array2, l, right);
        }
    }
    
    
    public static void main(String args[]){
        Scanner stdIn = new Scanner(System.in);
 
        int h = stdIn.nextInt();
        int n = stdIn.nextInt();
        int a[] = new int[n];
        int b[] = new int[n];
        double kouritsu[] = new double[n];
        //String s = stdIn.next();
        //String t = stdIn.next();
        //char c[] = s.toCharArray();
        //c[0] += 1;
        //boolean flag = true;
        int max = 0;
        int sum = 0;
        double saitsuyo = 0;
        int index = 0;
        
        for(int i = 0; i < n; i++){
            a[i] = stdIn.nextInt();
            
            if(a[i] > max){
                max = a[i];
            }
            
            b[i] = stdIn.nextInt();
            
            if((double)(a[i] / b[i]) > saitsuyo){
                saitsuyo = (double)a[i] / (double)b[i];
                index = i;
            }
        }
        
        int min = 10000000;
        boolean last = false;
        
        if(max >= h){
            for(int i = 0; i < n; i++){
                if(a[i] >= h){
                    if(b[i] < min){
                        min = b[i];
                    }
                }
            }
            sum += min;
            last = true;
        }else{
            sum += h / a[index] * b[index];
            h = h % a[index];
        }
        
        if(!last && h > 0){
            for(int i = 0; i < n; i++){
                if(a[i] >= h){
                    if(b[i] < min){
                        min = b[i];
                    }
                }
            }
            sum += min;
        }

        
        // if(sum >= h){
        //     System.out.println("Yes");
        // }else{
        //     System.out.println("No");
        // }
        
        System.out.println(sum);
 
        //System.out.println();
        //System.out.print();
 
        stdIn.close();
    }
}