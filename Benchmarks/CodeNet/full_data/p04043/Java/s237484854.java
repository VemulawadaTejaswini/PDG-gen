import java.util.Scanner;

class Main{
	public static void main(String[] args){
    	
      Scanner sc = new Scanner(System.in);
      boolean isOk = false ;
      int a = sc.nextInt();
      int b = sc.nextInt();
      int c = sc.nextInt();
      
      if(a==5){
      	if(b==7){
        	if(c==5){
            	isOk = true;
            }
        } else if (b==5){
        	if(c==7){
            	isOk = true;
            }
        }
        
      } else if (a==7){
      		if(b==5){
            	if(c==5){
                	isOk = true;
                }
            }
      }
    
      System.out.println( isOk );
    }

}