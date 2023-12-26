public class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String[] dimention = sc.nextLine().split(" ");
      int n = Integer.parseInt(dimention[0]);
      int m = Integer.parseInt(dimention[1]);
      int[][] matrix_1 = new int[n][m];
      int[] matrix_2 = new int[m];
      int[] answer = new int[n];
      for (int row = 0; row < n; row ++) {
         String[] input = sc.nextLine().split(" ");
         for(int col = 0; col < m; col ++) {
            matrix_1[row][col] = Integer.parseInt(input[col]);
         }
      }
      for (int i = 0; i < m; i ++) {
         matrix_2[i] = Integer.parseInt(sc.nextLine());
      }
      for (int row = 0; row < n; row ++) {
         int temp = 0;
         for (int col = 0; col < m; col ++) {
            temp += matrix_1[row][col] * matrix_2[col];
         }
         answer[row] = temp;
      }
      for(int i = 0; i < n; i ++) {
         System.out.println(answer[i]);
      }
   }
}
