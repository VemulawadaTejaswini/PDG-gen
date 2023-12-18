public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        for(int i = 1;;i++){
            int x =scan.nextInt();
            if(x == 0){
                break;
            }else{
                System.out.println("Case "+ i +": "+ x);
            }
        }
        scan.close();
    }
}
