import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();

    ArrayList<String> a = new ArrayList<String>(n);

    for(int i=0 ; i<n ; i++){
      String str = sc.next();
      char[] aa = str.toCharArray();
      Arrays.sort(aa);
      String newStr = new String(aa);
      a.add(newStr);
    }

    int cnt = 0;
    
    for(int i=0 ; i<n ; i++){
        int z = i+1;
        for(int j=z ; j<n ; j++){
            if(a.get(i).equals(a.get(j))){
                cnt++;
            }
        }
    }



    System.out.println(cnt);
  }
}