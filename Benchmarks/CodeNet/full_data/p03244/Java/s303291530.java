import java.util.*;
 
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in); 

        int n = sc.nextInt();
        int[] v = new int[n];
        for(int i = 0; i < n; i++){
            v[i] = sc.nextInt();
        }
        sc.close();
        int[] even = new int[100000];
        int[] odd = new int[100000];
        for(int i = 0; i < n; i=i+2){
            even[v[i]]++;
            odd[v[i+1]]++;
        }
        System.out.println("---");
        System.out.println(max_index(even));
        System.out.println(max_index(odd));
        System.out.println(second(even));
        System.out.println(second(odd));
        System.out.println("---");
        if(max_index(even) != max_index(odd)){
            System.out.println((n/2 - even[max_index(even)]) + (n/2 - odd[max_index(odd)]));
        } else{
            if((n/2 - even[max_index(even)]) + (n/2 - second(odd)) > (n/2 - second(even)) + (n/2 - odd[max_index(odd)])){
                System.out.println((n/2 - second(even)) + (n/2 - odd[max_index(odd)]));
            } else{
                System.out.println((n/2 - even[max_index(even)]) + (n/2 - second(odd)));
            }
        }
       
    }
    static int max_index(int[] a){
        int index = 0;
        int max = a[0];
        for(int i = 1; i < a.length; i++){
            if(a[i] > max){
                max = a[i];
                index = i;
            }
        }
        return index;
    }
    
    static int second(int[] a){
        int max1 = 0;
        int max2 = 0;
        for(int i = 0; i < a.length; i++){
            if(a[i] > max2 && a[i] > max1){
                max2 = max1;
                max1 = a[i];
            }
            if(a[i] > max2 && a[i] < max1){
                max2 = a[i];
            }
        }
        return max2;
    }
}