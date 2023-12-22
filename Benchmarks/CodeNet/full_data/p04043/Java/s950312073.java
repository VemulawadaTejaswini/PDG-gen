import java.util.Scanner;

class Main{
	public static void main(String[] args){
    	
      Scanner sc = new Scanner(System.in);
      String isOk = "NO" ;
      int a = sc.nextInt();
      int b = sc.nextInt();
      int c = sc.nextInt();
      
      if(a==5){
      	if(b==7){
        	if(c==5){
            	isOk = "YES";
            }
        } else if (b==5){
        	if(c==7){
            	isOk = "YES";
            }
        }
        
      } else if (a==7){
      		if(b==5){
            	if(c==5){
                	isOk = "YES";
                }
            }
      }
    
      System.out.println( isOk );
    }

}