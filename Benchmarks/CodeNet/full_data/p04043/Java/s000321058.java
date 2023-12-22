import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] iroha = scan.nextLine().split("\\s");
        int one  = Integer.valueOf(iroha[0]);
        int two = Integer.valueOf(iroha[1]);
        int three = Integer.valueOf(iroha[2]);
        if(one + two + three == 17){
            if(one == 7 || one == 5){
                if(two == 5 || two == 7){
                    System.out.println("YES");
                }else{
                    System.out.println("NO");
                }
            }else{
                System.out.println("NO");
            }
        }else{
            System.out.println("NO");
        }
    }
}