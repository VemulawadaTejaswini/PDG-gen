import java.util.*;
import java.util.List;

class Main{
  public static void main(String[] ar){
    new Main();
  }
  public Main(){
  	Scanner sc=new Scanner(System.in);
  	String s=sc.nextLine();
    int K=Integer.parseInt(sc.nextLine()); 	
  	//System.out.println(s);
  	List<String> substrs=new ArrayList<String>(new HashSet<>(getSubstrings(s)));

    Collections.sort(substrs);
    System.out.println(substrs.get(K-1));
    //for(String substr:substrs) System.out.println(substr);

  }
  public List<String> getSubstrings(String str){
    int l=str.length();
    List<String> substrs=new ArrayList<String>();
    for(int i=0;i<l;i++){
      for(int j=i+1;j<=l;j++){
        substrs.add(str.substring(i,j));
      }
    }

    return substrs;
  }
}