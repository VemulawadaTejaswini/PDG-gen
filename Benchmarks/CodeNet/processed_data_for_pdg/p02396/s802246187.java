public class Main{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int i = 1;
        do{
            String line1 = reader.readLine();
            int a = Integer.parseInt(line1);
            if(a == 0){
                break;
            }
            System.out.println("Case "+ i + ": "+a);
            i++;
        }while(true);
    }
}
