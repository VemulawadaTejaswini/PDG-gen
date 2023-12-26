public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);    
    String iShortNeedle = sc.next();
    String iLongNeedle = sc.next();
    String h = sc.next();
    String m = sc.next();
    double hour = Double.parseDouble(h);
    double min = Double.parseDouble(m);
    double wholeMin = (hour*60) + min;
    double shortNeedle = Double.parseDouble(iShortNeedle);
    double longNeedle = Double.parseDouble(iLongNeedle);
    double shortAngleByOneMin = (360.0/12.0)/60.0;
    double longAngleByOneMin = 360.0/60.0;
    double rHour = 0; 
    double rMin = 0;
    if(wholeMin!=0){
      rHour = shortAngleByOneMin * wholeMin; 
    }
    if(min!=0){
      rMin = longAngleByOneMin * min;
    }
    double diffAngle = Math.abs(rHour - rMin);    
    double aLength = 0;
    if(diffAngle!=0 || diffAngle!=180){
	  aLength = Math.sqrt( Math.pow(shortNeedle,2) + Math.pow(longNeedle,2) - 2 * shortNeedle * longNeedle * Math.cos(Math.toRadians(diffAngle)) );
    }else if(diffAngle==0){
      aLength = longNeedle - shortNeedle;    
    }else if(diffAngle==180){
      aLength = longNeedle + shortNeedle;
    }
    System.out.println(aLength);
  }
}
