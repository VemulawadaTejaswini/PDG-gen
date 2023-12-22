public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	      int H = sc.nextInt();
	      int W = sc.nextInt(); sc.nextLine(); //nextIntの後残る改行文字を消す
	      String[] line = new String[W];
	      int r=0;
	      for(int i=0;i<W;i++){
	      	line[i]=sc.nextLine();
	      } 
	      char[][] a = new char[H][W];
	      char[][] b = new char[H+2][W+2];
	         for(int j=0;j<W;j++){
	          for(int k=0;k<H;k++){
	           a[k][j]=line[j].charAt(k);
	           b[k+1][j+1]=a[k][j];
	          }
	         }
	         sc.close();
	         for(int j=0;j<W+2;j++){
	          for(int k=0;k<H+2;k++){
	           b[0][j]='.';
	           b[H+1][j]='.';
	           b[k][0]='.';
	           b[k][W+1]='.';
	          }
	         }
	          
	         for(int j=1;j<W+1;j++){
	          for(int k=1;k<H+1;k++){
	          if(b[k][j]=='#'&&b[k+1][j]=='.'&&b[k-1][j]=='.'&&b[k][j+1]=='.'&&b[k][j-1]=='.'){
	                                       r+=1;
	                      }else{
	                                       r+=0;
	                       }
	           }
	          }
	           if(r>0){
	                 System.out.println("No");
	           }else{
	                 System.out.println("Yes");      
	           }
    }

}
