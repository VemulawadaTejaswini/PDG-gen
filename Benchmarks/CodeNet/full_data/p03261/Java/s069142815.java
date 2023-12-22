import java.util.*;
class Main {
  public static void main (String[] args) throws Exception {
    
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    String [] st = new String[n];
    //boolean ans = true;
    
    for(int i=0; i<n; i++){
      st[i] = sc.next();
      }
      
    
 
    for(int i=0; i<n-1; i++){
        if(st[i+1].charAt(0)!=st[i].charAt(st[i].length()-1)){
          //ans =false;
          System.out.println("No");
          System.exit(0);
        }
        //if(i==n-1)break;
        for(int j=i+1; j<n; j++){
          //System.out.println(st[i] +" " +st[j]);
          if(st[i].equals(st[j])){
            //ans =false;
          System.out.println("No");
          System.exit(0);
        }
      }
    }
    
    
    
      System.out.println("Yes");


  }
}