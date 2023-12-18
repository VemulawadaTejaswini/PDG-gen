public class Main {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line;
        int a,b;
        int s,l;
        try{
        line = reader.readLine();
        String[] x = line.split(" ");
        a = Integer.parseInt(x[0]);
        b = Integer.parseInt(x[1]);
        s=a*b;
        l=2*a+2*b;
        System.out.println(s+" "+l);
        }catch (NumberFormatException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
