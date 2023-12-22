Input java.util.Scanner;
public static Main{
	public static void main(String args[]){
    Scanner scn = new Scanner (System.in);
      int N = scn.nextint();
	scn.close();
      int s;
      for(int i = 0 ; i<3 ; i++){
       switch (N.charAt(i))
        case 7 -> s += 1;
        default -> s += 0;
      };
      if(s>=1){
      System.out.println("Yes");
      }else{
      System.out.prontln("No");
      };
    }
}
