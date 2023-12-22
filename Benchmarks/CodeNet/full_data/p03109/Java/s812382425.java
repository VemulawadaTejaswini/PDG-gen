public class Main{
  public static void main(String[] args){
    int year = Integer.valueOf(args[0].substring(0, 3));
    int month = Integer.valueOfargs[0].substring(5, 6));
    int day = Integer.valueOfargs[0].substring(8, 9));
    Date inputDay = new Date(year, month, day, 12, 0, 0);
    Date s = new Date(2019, 4, 30, 12, 0, 0);
    if(s.before(inputDay)){
      System.out.println("Heisei");
    }else{
      System.out.println("TBD");
    }
  }
}