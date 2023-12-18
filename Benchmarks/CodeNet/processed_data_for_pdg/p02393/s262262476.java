public class Main {
    public static void main(String[] args){
        Scanner scan_ = new Scanner(System.in);
        int a_ = scan_.nextInt();
        int b_ = scan_.nextInt();
        int c_ = scan_.nextInt();
        int[]ints = {a_ , b_ , c_};
      Arrays.sort(ints);
      System.out.println(ints[0] + " " + ints[1] + " " + ints [2]);
    }
}
