public class Main{
  public static void main(String args[]){
    Scanner Weather=new Scanner(System.in);
    
    String str0=Weather;
    String str1="Sunny";
    String str2="Cloudy";
    String str3="Rainy";
    
    
    if(str0==str1){
      System.out.println("Cloudy");
    }else if(str0==str2){
      System.out.println("Rainy");
    }else{
      System.out.println("Sunny");
    }
  }
}

