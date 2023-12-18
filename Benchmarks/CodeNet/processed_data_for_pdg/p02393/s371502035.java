public class Main{
    public static void main(String args[]){
	Scanner in = new Scanner(System.in);
	int[] a = new int[3];
	for(int i=0; i<a.length; i++){
	    a[i]=in.nextInt();
	}
	Arrays.sort(a);
	for(int i=0; i<a.length; i++){
	    System.out.print(a[i]);
	    if(i != a.length-1)System.out.print(" ");
	    else System.out.println();
	}
   }
}
