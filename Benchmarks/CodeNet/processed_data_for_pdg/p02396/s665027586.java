public class Main{
    public static void main(String[] args){
        int input_int_number;
        int cnt=0;
        Scanner sc = new Scanner(System.in);
        while((input_int_number=sc.nextInt())!=0){
            cnt++;
            System.out.println("Case "+cnt+": "+input_int_number);
        }
    }
}
