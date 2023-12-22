import java.util.Scanner;

public class Main{
  public static int maxIndex(int[] array){
    int n = array.length;
    int max = 0;
    for(int i = 1; i < n; i++){
      if(array[i] > array[max]){
        max = i;
      }
    }
    return max;
  }
  
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int[] a = new int[n];
    int[] aa = new int[n];
    int[] b = new int[n];
    int[] bb = new int[n];
    int[] c = new int[n];
    int[] c_index = new int[n];
    int index = 0;
    int achieved = 0;
    int step = 0;
    for(int i = 0; i < n; i++){
      int tmp = scanner.nextInt();
      a[i] = tmp;
      aa[i] = tmp;
    }
    for(int i = 0; i < n; i++){
      int tmp = scanner.nextInt();
      b[i] = tmp;
      bb[i] = tmp;
      c[i] = tmp;
      c_index[i] = i;
    }
    
    for(int i = n-1; i > 0; i--){
      for(int j = 0; j < i; j++){
        if(c[j] < c[j+1]){
          c[j] ^= c[j+1];
          c[j+1] ^= c[j];
          c[j] ^= c[j+1];
          
          c_index[j] ^= c_index[j+1];
          c_index[j+1] ^= c_index[j];
          c_index[j] ^= c_index[j+1];
        }
      }
    }
    
    while(true){
      int max = c_index[index];
      if(a[max] == bb[max]){
        bb[max] = -1;
        index++;
        achieved++;
      }else{
        bb[max] -= b[(max-1)>=0?max-1:n-1];
        bb[max] -= b[(max+1)<n?max+1:0];
        b[max] = bb[max];
        c[index] = b[max];
        if(bb[max] < a[max]){
          step = -1;
          break;
        }else if(bb[max] == a[max]){
          bb[max] = -1;
          index++;
          achieved++;
        }
      }
      
      for(int j = index; j < n-1; j++){
        if(c[j] < c[j+1]){
          c[j] ^= c[j+1];
          c[j+1] ^= c[j];
          c[j] ^= c[j+1];
          
          c_index[j] ^= c_index[j+1];
          c_index[j+1] ^= c_index[j];
          c_index[j] ^= c_index[j+1];
        }else{
          break;
        }
      }

      step++;
      if(achieved == n){
        break;
      }
    }
    
    System.out.println(step);
  }
}
