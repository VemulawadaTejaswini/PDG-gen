class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String num1 = br.readLine();
        String[] num2 = num1.split(" ");
        int a = Integer.parseInt(num2[0]);
        int b = Integer.parseInt(num2[1]);
        if(a < b){
            System.out.println("a < b");
        }else if(a > b){
            System.out.println("a > b");
        }else{
            System.out.println("a == b");
        }
    }
}
