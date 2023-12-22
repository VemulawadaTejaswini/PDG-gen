import java.util.*;

public class Main{
  public static void main(String[] args){
    HashMap<String,String> hashmap = new HashMap<String,String>();
    List<String> list= new ArrayList<String>();
    String[] strArray;
    int count = 0;
    int plus = 0;

    //System.out.println("整数を入力");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    //System.out.println("文字列の入力");
    String str;
    for(int h=0; h<n; h++){
      //hashmap.put("apple","りんご");
      str = "";         //文字列の初期化
      str = sc.next();  //入力
      strArray = str.split("");
      Arrays.sort(strArray);
      str = String.join("",strArray);
      //System.out.println("ソート結果:"+str);
      if(list.size() < 1){
        list.add(str);
      }
      if(list.size() >= 1 && h!=0){
        for(int i=0; i<list.size(); i++){
          String L = list.get(i);
          if(L.equals(str)){
             plus = 1;
          }
        }
        if(plus==1){
          count += 1;
        }else{
          list.add(str);
        }
        plus = 0;
      }


      //System.out.println(list);
      //System.out.println(count);
      //System.out.println("**************");
    }
    System.out.println(count);
  }


}