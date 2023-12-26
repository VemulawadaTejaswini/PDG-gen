public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    if(-1000 <= a && a <= 1000 && -1000 <= b && b <= 1000 && a < b) {
        System.out.println("a < b");
    }else if(-1000 <= a && a <= 1000 && -1000 <= b && b <= 1000 && a > b) {
        System.out.println("a > b");
    }else if(-1000 <= a && a <= 1000 && -1000 <= b && b <= 1000 && a == b) {
        System.out.println("a == b");
    }else {
        System.out.println("Please enter a number from -1000 to 1000.");
    }
  }    
}
