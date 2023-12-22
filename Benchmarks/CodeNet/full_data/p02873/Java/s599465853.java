import java.util.Scanner;

class Main{
  public static void main(String[] args){
  	Scanner sc = new Scanner(System.in);
    String line = sc.nextLine();
    
    long sum = 0;
	long l[] = new long[line.length()];
    long r[] = new long[line.length()];
    l[line.length()-1] = 0; r[0] = 0;
    
    for(int i = 1; i < line.length(); i++){
      if(line.charAt(i) == '<') l[i] = l[i-1]+1;
      else l[i] = 0;
    }
    for(int i = line.length()-1; i > 0; i--){
      if(line.charAt(i) == '>') r[i-1] = r[i]+1;
      else r[i] = 0;
    }
      
    for(int i = 0; i < line.length(); i++){
      sum += Math.max(l[i], r[i]);
    }
    System.out.println(sum);

  }
}