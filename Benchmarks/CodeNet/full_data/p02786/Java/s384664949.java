import java.util.*;
class Main {
static Scanner sc=new Scanner(System.in);
private static long slove(long H){if(H==1) return 1;else return(2*slove(H/2)+1);}
public static void main(String[] args){System.out.println(slove(sc.nextLong()));}}