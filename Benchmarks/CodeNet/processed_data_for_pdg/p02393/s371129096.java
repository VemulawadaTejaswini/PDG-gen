public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int[] intArray = Arrays.stream(sc.nextLine().split(" "))
                           .mapToInt(Integer::parseInt)
                           .toArray();
    Arrays.sort(intArray);
    System.out.println(intArray[0]+" "+intArray[1]+" "+intArray[2]);
  }
}
