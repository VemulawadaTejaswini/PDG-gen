public class Main {
    public static void main(String[] defargs) {
        Scanner scanner = new Scanner(System.in);
        int height = scanner.nextInt();
        int width = scanner.nextInt();
        int area = height * width;
        int syui = 2 *(height + width);
        System.out.println(area + " " + syui);
        scanner.close();
    }
}
