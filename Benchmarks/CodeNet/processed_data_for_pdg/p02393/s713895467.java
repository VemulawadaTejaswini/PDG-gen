class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String[] strarr = str.split(" ");
        int num1 = Integer.parseInt(strarr[0]);
        int num2 = Integer.parseInt(strarr[1]);
        int num3 = Integer.parseInt(strarr[2]);
        int n;
        if(num1 > num2) {
            n = num2;
            num2 = num1;
            num1 = n;
        }
        if(num2 > num3) {
            n = num3;
            num3 = num2;
            num2 = n;
        }
        if(num1 > num2) {
            n = num2;
            num2 = num1;
            num1 = n;
        }
        System.out.println(num1 + " " + num2 + " " + num3);
    }
}
