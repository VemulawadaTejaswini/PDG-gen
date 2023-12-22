public class +- {
  public void main (int A, int B){
  	C = A + B;
    D = A - B;
    E = A * B;
 	 if( C>=D && C>=E ){
 	    System.out.println(C);
	 }
	 if( D>=C && D>=E ){
	     System.out.println(D);
	 }  
 	 if( E>=D && E>=C ){
 	    System.out.println(E);
 	 }
  }
}