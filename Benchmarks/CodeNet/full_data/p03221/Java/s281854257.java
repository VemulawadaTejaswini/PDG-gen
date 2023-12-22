import java.util.*;

public class Main{
  
  public static void main (String[] args){
    
    Main main = new Main ();
    main.solve();
  }
  
  private void solve (){
    
    Scanner scanner = new Scanner (System.in);
    
    int prefectureNum = scanner.nextInt();
    int cityNum = scanner.nextInt();
    
    ArrayList <Integer> cityList = new ArrayList <Integer>();
    ArrayList <Integer> cityListCopy = new ArrayList <Integer>();
    HashMap <Integer,Integer> map = new HashMap <Integer,Integer>();
    for (int index=0; index<cityNum; index++){
      Integer prefecture = scanner.nextInt();
      Integer year = scanner.nextInt();
      map.put(year,prefecture);
      cityList.add(year);
      cityListCopy.add(year);
    }
    
    Collections.sort(cityList);
    HashMap <Integer,Integer> orderMap = new HashMap <Integer,Integer>();
    for (Integer index=0; index<cityNum; index++){
      Integer year=cityList.get(index);
      orderMap.put(index,year);
    }
    
    int[] prefectureList = new int[prefectureNum];
    
    HashMap <Integer,Integer> CityOrder = new HashMap <Integer,Integer>();
    
    for (int index=0; index<cityNum; index++){
      int year = orderMap.get(index);
      int prefecture = map.get(year);
      int order = prefectureList[prefecture-1]+1;
      CityOrder.put(year,order);
      prefectureList[prefecture-1]+=1;
    }
    for (int index=0; index<cityNum; index++){
      int year = cityListCopy.get(index);
      int prefecture = map.get(year);
      StringBuffer sbPrefecture = new StringBuffer();
      sbPrefecture=getString(prefecture);
      int order = CityOrder.get(year);
      StringBuffer sbOrder = new StringBuffer();
      sbOrder=getString (order);
      
      
      System.out.print(sbPrefecture);
      System.out.println(sbOrder);
      
    }
  }
  
  private StringBuffer getString (int num){
    StringBuffer sb = new StringBuffer ();
	if (num<10){
      sb.append("00000");
    } else if (num<100){
      sb.append("0000");
    } else if (num<1000){
      sb.append("000");
    } else if (num<10000){
      sb.append("00");
    } else if (num<100000){
      sb.append("0");
    }
    sb.append(Integer.toString(num));
    return sb;
  }
}