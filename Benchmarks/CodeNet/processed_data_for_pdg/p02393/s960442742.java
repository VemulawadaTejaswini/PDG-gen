public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
         int intNum;
        if(a > b){
            intNum = a;
            a = b;
            b = intNum;
            }
            if(b >c){
                intNum = b;
                b = c;
                c = intNum;
                }
                if(a>b){
                     intNum = a;
                    a = b;
                     b = intNum;
                }
      System.out.println(a + " " + b + " " + c);
            }
}
