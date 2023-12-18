public class Main{
    public static void main(String[] arg){
        int x, i;
        x = 0;
        i = 0;
        Scanner scan = new Scanner(System.in);
        for(;;){
            i++;
        	x = scan.nextInt();
            if(x == 0) break;
            System.out.println("Case "+ i +": "+ x);
        }
        scan.close();
    }
}
