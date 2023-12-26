public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Long n = scanner.nextLong();
        Long count = 0L;
        Long result = 100L;
        for(;;) {
            result += ((long)Math.floor(result*0.01));
            count++;
            if(result >= n) break;;
        }
        System.out.println(count);
    }
}
