import java.util.Scanner; 

class MyClass {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
    System.out.println("PLease enter A B K respectively.");
    int A = myObj.nextInt();
    int B = myObj.nextInt();
    int K = myObj.nextInt();
    
    while(K > 0) {
        if(A > 0) {
            A = A - 1;
        }
        else {
            A = 0;
            if (B > 0) {
                B = B - 1;
            }
            else B = 0;
        }
        K = K - 1;
    }
       
    System.out.println(A + " " + B);        
  }
}
