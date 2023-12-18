public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int i=1;
        while(true){
            int a=scan.nextInt();
            if(a == 0)break;
            System.out.println("Case "+i+": "+a);
            i++;
        }
        scan.close();
        return;
    }
}
