import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int[] a = new int[num];
    
    
    fot(int i = 0;i < num;i++){
     a[i] = sc.nextInt();
    }
    
    for(int i = 0;i < num-1;i++){
     for(int j = i+1;j < num;j++){
       int tmp = a[i];
       if(a[i] < a[j]){
        a[i] = a[j];
        tmp = a[j];
       }
     }
    }
    System.out.println(a[0] - a[num]);
  }
}
