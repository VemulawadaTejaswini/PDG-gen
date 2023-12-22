import java.util.*;
class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    int[] array1 = new int[n];
    for (int i = 0; i < n; i++) {
        array1[i] = sc.nextInt();
    }
    int[] array2 = new int[n];
    for (int i = 0; i < n; i++) {
        array1[i] = sc.nextInt();
    }
     
    int array1Sum = 0;
    for (int i = 0; i < n; i++) {
      int sum = 1;
      for (int h = 1; h < array1[i] - 1; h++) {
        sum *= h;
      }
      array1Sum += sum;
    }
    
    
    int array2Sum = 0;
    for (int i = 0; i < n; i++) {
      int sum = 1;
      for (int h = 1; h < array2[i] - 1; h++) {
        sum *= h;
      }
      array2Sum += sum;
    }
    
    System.out.println(array1Sum);
    
  }
}