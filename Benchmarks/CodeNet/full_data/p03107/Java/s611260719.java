import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    
    String s=sc.next();
    ArrayList <String>arr=new ArrayList<>();
    for(int i=0;i<s.length();i++){
      arr.add(String.valueOf(s.charAt(i)));
    }
    Collections.sort(arr);
    int count=0;

    for(int i=0;;i++){
      if(arr.contains("0") && arr.contains("1")){
        arr.remove(0);
        arr.remove(arr.size()-1);
        count+=2;
      }else{
        break;
      }
    }

    System.out.println(count);


    sc.close();
  }
}