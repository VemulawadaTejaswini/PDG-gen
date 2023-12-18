public class Main{
    public static void main(String[] args){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try{
            String line;
            line = reader.readLine();
            String[] data = line.split(" ",2);
            int a = 0, b = 0;
            a = Integer.parseInt(data[0]);
            b = Integer.parseInt(data[1]);
            if(a == b){
                System.out.println("a == b");
            }else if(a > b){
                System.out.println("a > b");
            }else if(a < b){
                System.out.println("a < b");
            }
        }catch(NumberFormatException e){
            System.out.println(e);
        }catch(IOException e){
            System.out.println(e);
        }
    }
}
