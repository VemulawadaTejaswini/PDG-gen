import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    ArrayList<Integer> a = new ArrayList<Integer>(n);
    for (int i=0 ; i<n ; i++){
      a.add(sc.nextInt());
    }
    Collections.sort(a);

    while(a.size()!=1){
        int tmp = (a.get(0) + a.get(1)) / 2;
        a.remove(0);
        a.set(0, tmp);
        Collections.sort(a);
    }

    System.out.println(a.get(0));
  }
}