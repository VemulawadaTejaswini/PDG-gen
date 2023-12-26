public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        HashSet set = new HashSet();
        for(int s=0; s<k; s++){
            int d = scanner.nextInt();
            for(int i=0; i<d; i++){
                set.add(scanner.nextInt());
            }
        }
        System.out.println(n-set.size());
    }
}
