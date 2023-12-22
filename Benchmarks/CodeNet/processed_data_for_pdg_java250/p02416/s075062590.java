public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        while(true){
            String x = br.readLine();
            char[] charKeta = x.toCharArray();
            if(x.equals("0")){
                break;
            }
            for(int i = 0; i < charKeta.length; i++){
                int intKeta = Character.getNumericValue(charKeta[i]);
                sum += intKeta;
            }
            System.out.println(sum);
            sum = 0;
        }
    }
}
