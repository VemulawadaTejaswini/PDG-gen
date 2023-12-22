import java.util.*;
class Main{
    public static void main(String[] args){
	Scanner stdIn = new Scanner(System.in);
	int mon = stdIn.nextInt();
	int f00 = mon/500;
	int f =  mon%500/5;
	System.out.println(f00*1000+f*5);
    }
}