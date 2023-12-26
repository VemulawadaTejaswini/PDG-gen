public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int L = sc.nextInt();
    List<String> a = new ArrayList<>();
    for(int i=0; i<N ;i++){
        a.add(sc.next());
    }
    Collections.sort(a);
    String sum = "";
    for(String s : a){
        sum = sum.concat(s);
    }
        System.out.println(sum); 
    }    
}
