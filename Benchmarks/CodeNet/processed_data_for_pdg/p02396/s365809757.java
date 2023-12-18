public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int i = 0;
        while (true){
            int a = sc.nextInt();
            if( a == 0 )
            	break;
            i += 1;
            System.out.println("Case "+ i + ": "+ a );
        }
        sc.close();
    }
} 
