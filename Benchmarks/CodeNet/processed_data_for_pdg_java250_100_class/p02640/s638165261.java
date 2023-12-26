public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int flag = 0; 
        for(int i=0; i <= X; i++){
            if(Y == 2*(X-i)+4*i){
                flag = 1;
                break;
            }
        }
        if(flag == 1){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
