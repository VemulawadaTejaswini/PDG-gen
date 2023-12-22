import java.util.*;

class Main{
  public static void main(String[] args){
    
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    
    int a = N/100;
    int c = N%10;
    int b = (N-100*a-c)/10;
    
    if(a==7||b==7||c==7){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}

    
  }
}
