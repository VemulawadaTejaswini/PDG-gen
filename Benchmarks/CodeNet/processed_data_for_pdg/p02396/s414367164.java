public class Main{
    public static void main(String[] args){
        int i = 1;
        int x;
        Scanner scanner = new Scanner(System.in);
        while(true){
            x = scanner.nextInt();
            if(x == 0) break;
            else{
                System.out.println("Case " + i + ": " + x);
                i++;
            }
        }
    }
}
