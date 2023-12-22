    import java.util.Scanner;
    public  class Main{
      	public static void main(String args[]){
          int A,B;
          Scanner scan = new Scanner(System.in);
          A=scan.nextInt();
          B=scan.nextInt();
          A+=1;
          B+=1;
          if(A==1 && B==1){
             System.out.println("Draw");
          }
          if(A==1 && B!=1){
          	System.out.println("Alice");
          }
          if(A!=1 && B==1){
            System.out.println("Bob");
          }
          if(A < B){
            System.out.println("Bob");
          }
          if(A == B){
            	System.out.println("Draw");
           }
          if(A > B){
            	System.out.println("Alice");
          }
        }
    }
