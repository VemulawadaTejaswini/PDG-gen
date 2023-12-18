public class Main{
    public static void main(String args[]){
        try{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String[] array = str.split(" ");
        int x = Integer.parseInt(array[0]);
        int y = Integer.parseInt(array[1]);
        System.out.println(x*y + " " + 2*(x+y));
        }catch(IOException e){
        e.printStackTrace();
        }
    }
}
