public class Main {
    public static void main(String[] args) {
        InputStreamReader ist = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ist);
        String str = null;
        try{
            str = br.readLine();
            br.close();
        }catch(IOException e){
            e.printStackTrace();
        }
        String number[] = str.split(" ",0);
        int num[] = new int[2];
        int sum = 0;
        for(int i = 0;i < 2;i++){
            num[i] = Integer.parseInt(number[i]);
        }
        int a,b;
        a = num[0]*num[1];
        b = 2*(num[0]+num[1]);
        System.out.println(a + " " + b);
    }
}
