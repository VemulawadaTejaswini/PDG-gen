class Main 
{
  public static void main(String[] args) 
  {
  	String input = args[0];
    if(input.equals("Sunny")){
      System.out.println("Cloudy");
     
    } else if(input.equals("Cloudy")) {
      System.out.println("Rainy");
    } else if(input.equals("Rainy")){
      System.out.println("Sunny");
    }
    
  }
}
