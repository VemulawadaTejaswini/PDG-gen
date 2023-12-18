public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String[] s = input.split(" ");
        int width = Integer.parseInt(s[0]);
        int height = Integer.parseInt(s[1]);
        int perimeter = (width + height) * 2;
        int square = width * height;
        System.out.println(square + " " + perimeter);
    }
}
