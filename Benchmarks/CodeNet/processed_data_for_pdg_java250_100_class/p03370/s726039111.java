public class Main{
   public static Scanner sc = new Scanner(System.in);
   public static void main(String args[]){
      int N = sc.nextInt();
      int gram = sc.nextInt();
      int[] array = new int[N];
      int count = N; 
      int cost = 0; 
      for (int i = 0; i < N; i++) {
          array[i] = sc.nextInt();
      }
      Arrays.sort(array);
      for(int make : array) {
         cost += make;
      }
      int row = array[0];
      while (row + cost <= gram) {
         cost += row;
         count++;
      }
      out.println(count);
   }
}
