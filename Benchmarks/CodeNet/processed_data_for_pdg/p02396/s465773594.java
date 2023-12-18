public class Main {
    public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    for(int i=1;; i++)
        {
        String str = in.readLine();
        int num = Integer.parseInt(str);
        if(num == 0){break;}else
            {
            System.out.println("Case "+i+": "+num);
            }
        }
    }
}
