import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] lines = sc.nextLine().split(" ");
        System.out.println(Math.max(Integer.parseInt(lines[0]), Integer.parseInt(lines[2])) == Math.min(Integer.parseInt(lines[2]), Integer.parseInt(lines[1])) ? "Yes" : "No");
    }
}
