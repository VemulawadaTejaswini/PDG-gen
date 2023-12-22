import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		int[] bingo = new int[9];
      	for(int i = 0;i<9;i++){
			bingo[i] = scn.nextInt();
        }
		int n = scn.nextInt();
      	for(int j = 0; j < n;j++){
            int x = scn.nextInt();
          	for(int k = 0; k<9;k++){
              if( x == bingo[k]){
               		 bingo[k] = 0;
              }
            }
        }
      	String ret = "No";
      	int[][] places = {{0,1,2},{3,4,5},{6,7,8},{0,3,6},{1,4,7},{2,5,8},{0,4,8},{2,4,6}};
      	for(int l = 0;l<8;l++){
          int[] place = places[l];
          if(bingo[place[0]]+bingo[place[1]]+bingo[place[2]] == 0){
            ret = "Yes";
          }
        }
      	System.out.println(ret);
	}
}