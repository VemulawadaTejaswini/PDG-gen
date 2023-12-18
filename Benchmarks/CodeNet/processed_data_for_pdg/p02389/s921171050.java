public class Main {
    public static void main(String[] args) throws IOException{
    BufferedReader t=new BufferedReader(new InputStreamReader(System.in));
    String a=t.readLine();
    String[] s=a.split(" ");
    int l=Integer.parseInt(s[0]);
    int h=Integer.parseInt(s[1]);
    System.out.println(l*h+" "+(l+h)*2);
    }
}
