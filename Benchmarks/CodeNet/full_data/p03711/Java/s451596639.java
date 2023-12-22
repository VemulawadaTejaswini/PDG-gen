import java.util.*;

class Main{
  public static void main(String[] args){
    Integer a[] = {1,3,5,7,8,10,12};
    Integer b[] = {4,6,9,11};
    Integer c[] = {2};
    Scanner scan = new Scanner(System.in);
    Integer x = scan.nextInt();
    Integer y = scan.nextInt();
    Integer g1 = 0;
    Integer g2 = 0;
    if(Arrays.asList(a).contains(x)) {
      g1 = 1;
    }else if(Arrays.asList(b).contains(x)){
      g1 = 2;
    }else{
      g1 = 3;
    }
    if(Arrays.asList(a).contains(y)) {
      g2 = 1;
    }else if(Arrays.asList(b).contains(y)){
      g2 = 2;
    }else{
      g2 = 3;
    }
    if(g1==g2){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}

  