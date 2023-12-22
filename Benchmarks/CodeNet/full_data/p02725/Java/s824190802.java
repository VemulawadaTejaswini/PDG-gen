import java.util.*;
import java.math.*;

class Main{
public static void main(String args[]){
   Scanner sc = new Scanner(System.in);
   int k = sc.nextInt();
   int n = sc.nextInt();
   int array[] = new int[n];
   int ret = 0;
   for (int i=0;i<n;i++){
     
    int temp = sc.nextInt();
    if (temp > k-temp){
    temp = k-temp;
    }
    array[i] = temp;
    ret += array[i];
   }
   System.out.println(ret);
}
}
