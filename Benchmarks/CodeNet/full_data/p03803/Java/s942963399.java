  import java.util.Random;
    public  class Main{
      	public static void main(String args[]){
          int A,B;
          Random ran =new Random();
          A=ran.nextInt(13);
          B=ran.nextInt(13);
          A+=1;
          B+=1;
          System.out.println(A + B);
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
