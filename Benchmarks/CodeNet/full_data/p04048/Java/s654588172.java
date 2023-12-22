import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		n++;
		int x = sc.nextInt();
		//1:point 0:not point
		int field[][] = new int[n][2*n-1];
		for(int i=0; i<n; i++){
			for(int j=0; j<2*n-1; j++){
				if((i+j)%2==0){
					if((i<=j && j<n)||(i<=(2*n-2-j) && j>=n)){
						field[i][j] = 1;
					}
					else{
						field[i][j] = 0;
					}
				}
				else{
					field[i][j] = 0;
				}
			}
		}
		//10:ab 20:bc 30:ca 40:corner
		field[0][0] = field[0][0] + 40;
		field[0][2*n-2] = field[0][2*n-2] + 40;
		field[n-1][n-1] = field[n-1][n-1] + 40;
		for(int i=0; i<n; i++){
			for(int j=0; j<2*n-1; j++){
				if(i==0 && field[i][j]==1){
					field[i][j] = field[i][j] + 20;
				}
				else if(i==j && field[i][j]==1){
					field[i][j] = field[i][j] + 10;
				}
				else if(i==2*n-2-j && field[i][j]==1){
					field[i][j] = field[i][j] + 30;
				}
			}
		}
		//light[i, j, vec]
		int light[] = {n-x, n-x, 20};
		field[n-x][n-x] = field[n-x][n-x] + 30;
		int ans = 0;
		while(true){
			if(Math.abs(light[2])==10){
				if(light[2]>0){
					light[0] += -1;
					light[1] += -1;
				}
				else{
					light[0] += 1;
					light[1] += 1;
				}
			}
			else if(Math.abs(light[2])==20){
				if(light[2]>0){
					light[1] += 2;
				}
				else{
					light[1] += -2;
				}
			}
			else{
				if(light[2]>0){
					light[0] += 1;
					light[1] += -1;
				}
				else{
					light[0] += -1;
					light[1] += 1;
				}
			}
			ans ++;
			if(field[light[0]][light[1]]>=40){
				break;
			}
			else if(field[light[0]][light[1]]>=30){
				field[light[0]][light[1]] = 41;
				if(Math.abs(light[2])==10){
					light[2] = 20*(int)Math.signum(light[2]);
				}
				else{
					light[2] = 10*(int)Math.signum(light[2]);
				}
			}
			else if(field[light[0]][light[1]]>=20){
				field[light[0]][light[1]] = 41;
				if(Math.abs(light[2])==10){
					light[2] = 30*(int)Math.signum(light[2]);
				}
				else{
					light[2] = 10*(int)Math.signum(light[2]);
				}
			}
			else if(field[light[0]][light[1]]>=10){
				field[light[0]][light[1]] = 41;
				if(Math.abs(light[2])==20){
					light[2] = 30*(int)Math.signum(light[2]);
				}
				else{
					light[2] = 20*(int)Math.signum(light[2]);
				}
			}
			else{
				field[light[0]][light[1]] = light[2] + 1;
			}
		}
		System.out.println(ans);
	}
}