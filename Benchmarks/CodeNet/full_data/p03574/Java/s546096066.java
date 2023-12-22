import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();//マス目の設定
        int W = sc.nextInt();
      	int[][] result;
      	result=new int[H+2][W+2];//上下左右に1列分の余裕を
       	
      
      	for(int i=0;i<H;i++) {//データの打ち込み
          	result[i][0]=100;
          	result[i][W+1]=100;
			String input=sc.next();
            for(int j=0;j<W;j++){
              	result[0][j]=100;
              	result[H+1][j]=100;
                if (input.charAt(j)=='#'){
                    result[i+1][j+1]=-1;
                }else{
                    result[i+1][j+1]=0;
                }
            }
        }
      
      
      
      
      	for(int i=1;i<H+1;i++) {//変換
          for(int j=1;j<W+1;j++){
           	if(result[i][j]!=-1){
              
              if(result[i][j+1]==-1){
				result[i][j]+=1;
              }
              if(result[i][j-1]==-1){
				result[i][j]+=1;
              }
              if(result[i+1][j]==-1){
				result[i][j]+=1;
              }
              if(result[i-1][j]==-1){
				result[i][j]+=1;
              }
              if(result[i+1][j+1]==-1){
				result[i][j]+=1;
              }
              if(result[i-1][j+1]==-1){
				result[i][j]+=1;
              }
              if(result[i+1][j-1]==-1){
				result[i][j]+=1;
              }
              if(result[i-1][j-1]==-1){
				result[i][j]+=1;
              }
              
           	}
          }
		}
      
      
      for(int i=1;i<H+1;i++) {//データの書き出し
        for(int j=1;j<W;j++){
          if(result[i][j]==-1){
			System.out.print('#');
          }else{
          	System.out.print(result[i][j]);
          }
        }
        
		if(result[i][W]==-1){
		  System.out.println('#');
        }else{
          System.out.println(result[i][W]);
        } 
      }
      
    }
}


