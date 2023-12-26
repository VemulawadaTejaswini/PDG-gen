public class Main {
    public static void main(String[] args) {
        int val = 0; 
        int a = 0; 
        int com = 0; 
        int count = 1; 
        Scanner sc = new Scanner(System.in);
        val = sc.nextInt();
        a = sc.nextInt();
        com = a;
        while (val >= com){
            com *= a;
            count += 1;
        }
        System.out.println(count);
    }
}
