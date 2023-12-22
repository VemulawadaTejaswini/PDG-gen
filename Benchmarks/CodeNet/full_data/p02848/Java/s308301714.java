import java.util.Scanner;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int N = sc.nextInt();
   String S = sc.next();
   int[] Si = new int[S.length()];
   for(int i = 0; i<S.length();i++)
   {
		Si[i] = getNumber(S.substring(i,i+1));       
   }
   for(int i = 0; i<S.length();i++)
   {
		if(Si[i] + N >= 26) Si[i] = Si[i] + N -26;
     	else Si[i] += N;
   }
   String Ans = "";
   for(int i = 0; i<S.length();i++)
   {
    	Ans += getAlphabet(Si[i]); 
   }
   System.out.println(Ans);
 }
  public static int getNumber(String p)
  {
    int k = 0;
    if(p.equals("A")) k =0;
    else if(p.equals("B")) k =1;
    else if(p.equals("C")) k =2;
    else if(p.equals("D")) k =3;
    else if(p.equals("E")) k =4;
    else if(p.equals("F")) k =5;
    else if(p.equals("G")) k =6;
    else if(p.equals("H")) k =7;
    else if(p.equals("I")) k =8;
    else if(p.equals("J")) k =9;
    else if(p.equals("K")) k =10;
    else if(p.equals("L")) k =11;
    else if(p.equals("M")) k =12;
    else if(p.equals("N")) k =13;
    else if(p.equals("O")) k =14;
    else if(p.equals("P")) k =15;
    else if(p.equals("Q")) k =16;
    else if(p.equals("R")) k =17;
    else if(p.equals("S")) k =18;
    else if(p.equals("T")) k =19;
    else if(p.equals("U")) k =20;
    else if(p.equals("V")) k =21;
    else if(p.equals("W")) k =22;
    else if(p.equals("X")) k =23;
    else if(p.equals("Y")) k =24;
    else if(p.equals("Z")) k =25;
    return k;
  }
  
  public static String getAlphabet(int k)
  {
    	String SS = "";
    	if(k == 0) SS = "A";
    	else if(k == 1) SS = "B";
    	else if(k == 2) SS = "C";
    	else if(k == 3) SS = "D";
    	else if(k == 4) SS = "E";
    	else if(k == 5) SS = "F";
    	else if(k == 6) SS = "G";
    	else if(k == 7) SS = "H";
    	else if(k == 8) SS = "I";
    	else if(k == 9) SS = "J";
    	else if(k == 10) SS = "K";
    	else if(k == 11) SS = "L";
    	else if(k == 12) SS = "M";
    	else if(k == 13) SS = "N";
    	else if(k == 14) SS = "O";
    	else if(k == 15) SS = "P";
    	else if(k == 16) SS = "Q";
    	else if(k == 17) SS = "R";
    	else if(k == 18) SS = "S";
    	else if(k == 19) SS = "T";
    	else if(k == 20) SS = "U";
    	else if(k == 21) SS = "V";
    	else if(k == 22) SS = "W";
    	else if(k == 23) SS = "X";
    	else if(k == 24) SS = "Y";
    	else if(k == 25) SS = "Z";
    	return SS;
  }
}