class Main {
  public static void main(String[] a) {
    Scanner scan = new Scanner(System.in);
    String[] nums = scan.nextLine().split("\\s");
    Integer h = Integer.valueOf(nums[0]);
    Integer w = Integer.valueOf(nums[1]);
    System.out.println((h * w) + " " + (h *2 + w * 2));
  }   
}
