public class Main {
     public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int W = sc.nextInt();
    int H = sc.nextInt();
    int x = sc.nextInt();
    int y = sc.nextInt();
    int r = sc.nextInt();
    if(0 < W && W <= 100 && 0 < H && H <= 100 && 0 < r && r <= 100 
             && -100 <= x && x <= 100 && -100 <= y && y <= 100) {
        if(x + r <= W && y + r <= H && x - r >= 0 && y - r >= 0) {
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }        
    }else {
        System.out.println("Please enter appropriate number.");
    }
  }
}
