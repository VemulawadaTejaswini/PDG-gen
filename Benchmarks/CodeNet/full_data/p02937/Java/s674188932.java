import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//String tmp = sc.next();
		//int tmp = sc.nextInt();
		//Long tmp = sc.nextLong();
      String s = sc.next();
      String t = sc.next();
      //String tmpS = s + s;
      ArrayList<String> tList = new ArrayList<String>();
      for(int i = 0; i < t.length(); i++){
        tList.add(t.substring(i , i + 1));
      }
      Long output = new Long(0);
      int sLoop = 0;
      while(tList.size() != 0){
        String sTmp = s;
        String sTmp2 = s;
        while(sTmp2.indexOf(tList.get(0)) != -1){
          String getList = tList.get(0);
          output = (sLoop * s.length()) + sTmp.indexOf(getList) + new Long(1);
          sTmp = sTmp.substring(0,s.indexOf(getList)) + "?" + sTmp.substring(s.indexOf(getList) + 1,s.length());
          sTmp2 = sTmp.substring(s.indexOf(getList) + 1,s.length());
          tList.remove(0);
          //System.out.println("tmp:" + sTmp);
      //System.out.println("tmp2:" + sTmp2);
      //System.out.println(tList);
      //System.out.println(output);
          if(tList.size() == 0){
       		 break;
      	  }
        }
        if(tList.size() == 0){
          break;
        }
        if(s.indexOf(tList.get(0)) == -1){
          System.out.println("-1");
          return;
        }
        sLoop++;
      }
      System.out.println(output);
	}
}
