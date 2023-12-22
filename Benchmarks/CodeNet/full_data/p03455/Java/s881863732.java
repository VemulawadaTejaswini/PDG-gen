public class Main{
    public static String main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int result = a * b;
        if(result % 2 == 0){
            return "Even";
        }else{
            return "Odd";
        }

    }