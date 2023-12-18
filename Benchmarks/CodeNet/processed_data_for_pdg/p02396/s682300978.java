public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        boolean check = false;
        int count = 1;
        while(!check){
            int x = scan.nextInt();
            if(x != 0){
                System.out.println("Case " + count + ": " + x);
                count++;
            }else if(x == 0){
                check = true;
            }
        }
    }
}
