public class Main {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int plus = A + B;
        int minus = A - B;
        int multiple = A * B;
        if (plus >= minus && plus >= multiple){
           System.out.println(plus); 
        } else if (minus >= plus && minus >= multiple) {
            System.out.println(minus);
        } else{
            System.out.println(multiple);
        }
        sc.close();
    }
}
