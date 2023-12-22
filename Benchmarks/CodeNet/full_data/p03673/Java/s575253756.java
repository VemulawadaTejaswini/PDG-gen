import java.util.*;
public class Main{

  public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[] arr = new int[n];

      int leftIdx = (n - 1) / 2;
      int rightIdx = leftIdx + 1;
      boolean flag = true;

      for(int i = 0; i < n; i++) {
        if(flag) {
          arr[leftIdx--] = sc.nextInt();
          flag = false;
        } else {
          arr[rightIdx++] = sc.nextInt();
          flag = true;
        }
      }
      if(n % 2 == 0)
        reverse(arr);
      for(int i = 0; i < arr.length; i++)
        if(i == arr.length - 1)
            System.out.println(arr[i]);
        else
            System.out.print(arr[i] + " ");
        
  }

  private static void reverse(int[] arr) {
    int left = 0, right = arr.length - 1;
    while(left < right) {
      int t = arr[left];
      arr[left] = arr[right];
      arr[right] = t;
      left++;
      right--;
    }
  }
}
