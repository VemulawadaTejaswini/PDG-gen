import java.util.*;
class Main{

     public static void main(String []args){
      Scanner scan = new Scanner(System.in);
      int n = scan.nextInt() ;
      char arr[] = new char[n] ; 
      ArrayList<Character> a = new ArrayList<Character>();
      for(int i = 0; i<n ; i++){
          arr[i] = scan.next().charAt(0);
          if(!a.contains(arr[i])){
              a.add(arr[i]) ;
          }
      }
      System.out.println(a.size()==4 ? "Four":"Three") ;
    }
}