public class Main{
    public static void main(String args[] ) throws Exception {
        try{BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int x = Integer.parseInt(line);
        System.out.println(x*x*x);
        }catch(NumberFormatException e) {
            System.out.println(e);
        }
    }
}
