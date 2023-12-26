class Main {
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    int numRow = scanner.nextInt();
    int numColumn = scanner.nextInt();
    scanner.nextLine(); 
    int[][] determinantA = new int[numRow][numColumn];
    int[] determinantB = new int[numColumn];
    for (int i = 0; i < numRow; i++) {
      String[] rowElementsInString = scanner.nextLine().split(" ");
      for (int j = 0; j < numColumn; j++) {
        determinantA[i][j] = Integer.parseInt(rowElementsInString[j]); 
      }
    }
    for (int i = 0; i < numColumn; i++) {
      determinantB[i] = Integer.parseInt(scanner.nextLine());
    }
    int ans = 0;
    for (int y = 0; y < numRow; y++) {
      for (int x = 0; x < numColumn; x++) {
        ans += determinantA[y][x] * determinantB[x];
      }
      System.out.println(ans);
      ans = 0;
    }
  }
}
