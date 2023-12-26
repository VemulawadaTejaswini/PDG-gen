public class Main {
    public static void main(String []args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String t = br.readLine();
        t=t.substring(0,t.length()-1);
        if(s.equals(t))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
