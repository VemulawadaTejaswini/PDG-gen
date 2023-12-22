public class Main{
  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    
    int days = 0;
    
    if(S == "SUN"){}
    else if(S == "SAT"){ days += 1;}
    else if(S == "FRI"){ days += 2;}
    else if(S == "THU"){ days += 3;}
    else if(S == "WED"){ days += 4;}
    else if(S == "TUE"){ days += 5;}
    else if(S == "MON"){ days += 6;}
    
    System.out.println(days);
  }
}