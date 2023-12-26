class Main {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    String[] nums = scanner.nextLine().split(" ");
    int n = Integer.parseInt(nums[0]);
    int m = Integer.parseInt(nums[1]);
    int[][] A = new int[n][m];
    int[] b = new int[m];
    for(int i=0; i<n; i++){ 
      String[] r = scanner.nextLine().split(" ");
      for(int j=0; j<m; j++){
        int tmp = Integer.parseInt(r[j]);
        A[i][j] = tmp;
      }
    }
    for(int i=0; i<m; i++){ 
      String r = scanner.nextLine();
      b[i] = Integer.parseInt(r);
    }
    int[] answer = new int[n];
    for(int i=0; i<n; i++){
      for(int j=0; j<m; j++){
        answer[i] += A[i][j] * b[j];
      }
    }
    for(int i=0; i<n; i++){
      System.out.println(answer[i]);
    }
  }
}
