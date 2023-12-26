public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long out = 0;
        long work = 100;
        while(true){
            work = (long)(work * 1.01);
            out += 1;
            if(work >= x) break;
        }
        System.out.println(out);
    }
}
