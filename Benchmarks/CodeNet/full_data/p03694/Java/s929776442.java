import java.util.* ; 
class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner (System.in);
    int n  = scan.nextInt() ;
    
    ArrayList<Integer> a = new ArrayList<>();
    for (int i = 0 ; i <n ; i++){
        a.add(scan.nextInt()) ;
      
    }
    System.out.println(Collections.max(a, null) - Collections.min(a,null));   
  }
}
