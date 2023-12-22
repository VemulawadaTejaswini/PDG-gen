public class Main {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int len = scanner.nextInt();
    String[] nums = scanner.nextLine();
    Arrays.sort(nums);
    int first = (Int)nums[0];
    int last = (Int)nums[len-1];
    System.out.println(last-first);
  }
}