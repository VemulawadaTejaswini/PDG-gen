import java.util.Scanner;

class Main{
	int[] ele=new int[4];

  public static void main(String[] ar){
    new Main();
  }
  public Main(){
  	Scanner sc=new Scanner(System.in);
  	String line=sc.nextLine();
  	String[] elestr=line.split(" ");
  	for(int i=0;i<4;i++) ele[i]=Integer.parseInt(elestr[i]);  	
  	//for(int outs:ele) System.out.println(outs);
  	
  	if(isCOMable()){
  		System.out.println("Yes");
  	}else{
			System.out.println("No");
  	}
  }
	public boolean isCOMable(){
			return ((Math.abs(ele[0]-ele[1])<=ele[3]
			 			&& Math.abs(ele[1]-ele[2])<=ele[3])
			 			|| Math.abs(ele[0]-ele[2])<=ele[3]);
	}
}