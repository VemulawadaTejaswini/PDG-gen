public class Main{
  public static void main (String[] args){
	int A,B,C;
	Scanner sc = new Scanner (System.in);
		A=sc.nextInt();
	if(A%10==1){
	  A=A+8;
	}else{
	  A=A-8;
	}
	if((A%100)/10==1){
	  A+=80;
	}else{
	  A-=80;
	}
	if(A/100==1){
	  A+=800;
	}else{
	  A-=800;
	}
        System.out.println(A);
  }
}
