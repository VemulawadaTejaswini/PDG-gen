public class Main {
    public static void main(String[] args) {
        try{
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String str = reader.readLine();
             String[] arr = str.split(" ");
            int a = Integer.parseInt(arr[0]);
            int b = Integer.parseInt(arr[1]);
            int c = Integer.parseInt(arr[2]);
            Arrays.sort(arr);
            System.out.println(arr[0]+" "+arr[1]+" "+arr[2]);
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
