public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            while(true){
                String input = br.readLine();
                String[] strArray = input.split(" ");
                int a = Integer.parseInt(strArray[0]);
                String op = strArray[1];
                int b = Integer.parseInt(strArray[2]);
                int ans = 0;
                if(op.equals("?")){
                    break;
                }
                if(op.equals("+")){
                    ans = a + b;
                }
                if(op.equals("-")){
                    ans = a - b;
                }
                if(op.equals("*")){
                    ans = a * b;
                }
                if(op.equals("/")){
                    ans = a / b;
                }
                System.out.println(ans);
            }
        }catch(ArithmeticException ex){
                System.err.println(ex);
        }
    }
}
