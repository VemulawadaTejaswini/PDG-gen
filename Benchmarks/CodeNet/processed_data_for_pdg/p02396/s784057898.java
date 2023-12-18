public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 1;
        int i = 0;
        while (x > 0) {
            x = Integer.parseInt(sc.next());
            i++; 
            if (x > 0)
                System.out.println("Case " + i + ": " + x); 
        }
    }
}
