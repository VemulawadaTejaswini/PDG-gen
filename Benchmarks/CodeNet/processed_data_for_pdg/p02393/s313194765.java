public class Main {
    public static void main (String[] args) throws java.lang.Exception {
    BufferedReader input = new BufferedReader (new InputStreamReader(System.in));
    String txt = input.readLine();
    String[] text = txt.split(" ");
    Arrays.sort(text);
    System.out.println(text[0] + " " + text[1] + " " + text[2]);
    }
}
