import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        
        if(A<C & C<B){
                    System.out.println("Yes");
        }
        else if(B<C & C<A){
                    System.out.println("Yes");
        }
        else {
                    System.out.println("No");
        }      
    }
}
