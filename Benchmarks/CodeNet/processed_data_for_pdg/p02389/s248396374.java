public class Main{
    public static void main(String[] args){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try{
            int a,b;
            String line = reader.readLine();
            StringTokenizer token = new StringTokenizer(line," ");
            a = Integer.parseInt(token.nextToken());
            b = Integer.parseInt(token.nextToken());
            System.out.println((a*b)+" "+(a*2+b*2));
        }catch(IOException e){
            System.out.println(e);
        }catch(NumberFormatException e){
System.out.println("The input number was not correct.");
        }
    }
}
