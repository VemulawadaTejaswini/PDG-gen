public class Main{
  public static void main(String args[])
  {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    int c = scanner.nextInt();
    if(a < b){
      if(b <= c){
        if(a < c){
          System.out.println(a + " " + b + " " + c);
        }
        else{   
          System.out.println("No");
        }
      }
      else{     
        if(a <= c){
          System.out.println(a + " " + c + " " + b);
        }
        else{   
          System.out.println(b + " " + c + " " + a);
        }
      }
    }
    else if(a > b){
      if(b < c){
        if(a < c){
          System.out.println(b + " " + a + " " + c);
        }
        else{   
          System.out.println(b + " " + c + " " + a);
        }
      }
      else{     
        if(a < c){
          System.out.println("No");
        }
        else{   
          System.out.println(c + " " + b + " " + a);
        }
      }
    }
  }
}
