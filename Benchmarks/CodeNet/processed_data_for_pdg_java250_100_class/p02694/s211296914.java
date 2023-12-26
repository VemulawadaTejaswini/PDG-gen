public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        long k = Long.parseLong(in.nextLine());
        in.close();
        int i = 0;
        long base = 100;
        while(base < k){
            long inc = (long)(base * 0.01);
            base += inc;
            i++;
        }
        System.out.println(i);
    }
}
