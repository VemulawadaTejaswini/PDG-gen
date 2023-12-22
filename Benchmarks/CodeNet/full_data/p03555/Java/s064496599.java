import java.util.Scanner;

class Main{
  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);

    String str1 = scan.next();
    String str2 = scan.next();
    char[]  charArg1 = new char[3];
    char[]  charArg2 = new char[3];

    for (int i = 0 ; i < 3 ; i++){
        charArg1 [i] = str1.charAt(i);
        charArg2 [i] = str2.charAt(i);
    }
    
    //【CHECK】charArg1
	 if(!(charArg1 [0] ==(charArg2 [2])) ){
	 	System.out.println("NO");
	 	return;
	 }
	 if(!(charArg1 [1] ==(charArg2 [1]) )){
	 	System.out.println("NO");
	 	return;
	 }
	 if(!(charArg1 [2] ==(charArg2 [0]) )){
	 	System.out.println("NO");
	 	return;
	 }

    //【CHECK】charArg2
	 if(!(charArg2 [0] ==(charArg1 [2]) )){
	 	System.out.println("NO");
	 	return;
	 }
	 if(!(charArg2 [1] ==(charArg1 [1]) )){
	 	System.out.println("NO");
	 	return;
	 }
	 if(!(charArg2 [2] ==(charArg1 [0]) )){
	 	System.out.println("NO");
	 	return;
	 }

	System.out.println("YES");
	return;
  }
}