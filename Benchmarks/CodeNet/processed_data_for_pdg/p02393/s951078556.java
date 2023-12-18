public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int[] array = new int[3];
    array[0] = scan.nextInt();
    array[1] = scan.nextInt();
    array[2] = scan.nextInt();
    for (int i = 0; i < 2; i++) {
      for (int j = i + 1; j < 3; j++) {
        if (array[i] > array[j]) {
          int tmp = array[i];
          array[i] = array[j];
          array[j] = tmp;
        }
      }
    }
    for (int i = 0; i < array.length-1; i++){
      System.out.print(array[i] + " ");
    }
    System.out.println(array[array.length-1]);
  }
}
