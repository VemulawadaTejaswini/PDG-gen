import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int s = sc.nextInt();
    String str = String.valueOf(s);
    boolean yymm = false;
    boolean mmyy = false;
    String aa = str.substring(0,2);
    String bb = str.substring(2);
    
    
    int mae = Integer.parseInt(aa.replaceFirst("0",""));
    int ato = Integer.parseInt(bb.replaceFirst("0",""));
    System.out.println(mae);
    System.out.println(ato);
    
    if(mae<13&&mae!=0&&ato!=0){
      mmyy = true;
    }
    if(ato<13&&ato!=0&&mae!=0){
        yymm = true;
    }
    if(mmyy&&yymm){System.out.println("AMBIGUOUS");}
    if(mmyy&&!yymm){System.out.println("MMYY");}
    if(!mmyy&&yymm){System.out.println("YYMM");}
    if(!mmyy&&!yymm){System.out.println("NA");}
  }
}
