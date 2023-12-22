import java.util.*;

class Main {
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);

      int[] arr   = new int[3];
      int   count = 0;
      for(int i = 0; i < 3; i++){
          arr[i] = scan.nextInt();
          }
      Arrays.sort(arr);
      if((arr[1] - arr[0]) % 2 == 0){
         count += (arr[1] - arr[0]) / 2;
         count += arr[2] - arr[1];
         }
      else{
          count += (arr[2] - arr[0]) / 2;
          count += (arr[2] - arr[1]) / 2 + 1;
          }

      System.out.println(count);
   }
}
