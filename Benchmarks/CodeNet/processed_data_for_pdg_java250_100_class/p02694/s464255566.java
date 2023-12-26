public class Main{
    public static void main(String args[]) throws IOException {
        Scanner scan=new Scanner(System.in);
        long P=100;
        long X=scan.nextLong();
        int x=0;
        long it=0;
        while (P<X){
            it= (long) Math.ceil(P/100);
            P= P+it;
            x++;
        }
        System.out.println(x);
    }
}
