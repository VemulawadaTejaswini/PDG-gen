public class Main {
    public static void main(String[] args) {
        int N = new java.util.Scanner(System.in).nextInt();
        int digit=9;
        int Sn=0;
        while(digit>=0) {
            double ten = Math.pow(10, digit);
            double num_d = N / ten;
            int num = (int) num_d;

            if (num > 0) {
                N = N - num * (int) ten;
                Sn = Sn + num;
            }
            digit--;
        }
        System.out.println(Sn);

    }

}
