public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w_x = sc.nextInt(); 
        int h_y = sc.nextInt(); 
        int circle_x = sc.nextInt(); 
        int circle_y = sc.nextInt(); 
        int circle_r = sc.nextInt(); 
        boolean containsCircle = false;
        int circle_d = 2 * circle_r;
        if (circle_x <= 0 || circle_y <= 0) {
            containsCircle = false;
        } else if (circle_x >= w_x || circle_y >= h_y) {
            containsCircle = false;
        } else if (w_x - circle_d >= 0 && h_y - circle_d >= 0) {
            containsCircle = true;
        }
        if (containsCircle) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
