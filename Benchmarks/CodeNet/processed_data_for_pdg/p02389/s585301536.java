public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int height = Integer.parseInt(sc.next());
        int width = Integer.parseInt(sc.next());
        StringBuilder sb = new StringBuilder();
        sb.append(height * width);
        sb.append(" ");
        sb.append(height * 2 + width * 2);
        System.out.println(sb.toString());
    }
}
