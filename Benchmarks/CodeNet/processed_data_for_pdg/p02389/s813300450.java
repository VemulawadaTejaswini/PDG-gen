public class Main {
    public static void main(String args[]) {
        BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
        try {
            int x = 0;
            int y = 0;
            String str = input.readLine();
            String[] a = str.split("[\\s]+");
            x = Integer.parseInt(a[0]);
            y = Integer.parseInt(a[1]);
            System.out.println(x*y + " " + (x*2 + y*2));
        } catch(IOException e) {
        }
    }
}
