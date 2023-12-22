import java.util.*;

class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int anum = sc.nextInt();
    int bnum = sc.nextInt();
    // String a[][] = new String[anum][bnum];
    String a[] = new String[anum];
    
    for(int i=0;i<anum;i++){
      // for(int j=0;j<bnum;j++){
        a[i] = sc.next();
      // }
    }
    for(int i=0;i<bnum+2;i++){
      System.out.print("#");
    }
    System.out.println();
    
    for(int i=0;i<anum;i++){
      System.out.print("#");
      // for(int j=0;j<bnum;j++){
        System.out.print(a[i]);
      // }
      System.out.print("#");
      System.out.println();
    }
    
    for(int i=0;i<bnum+2;i++){
      System.out.print("#");
    }
    
  }
}