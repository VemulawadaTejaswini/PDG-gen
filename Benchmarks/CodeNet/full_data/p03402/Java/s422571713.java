//(クロ)# = 35, (シロ). = 46

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);

	int[][] X = new int[100][100];

	//左半分シロ
	for(int i = 0; i < 100; i++){
	    for(int j = 0; j < 50; j++){
		X[i][j] = 46;
	    }
	}
	//右半分クロ
	for(int i = 0; i < 100; i++){
	    for(int j = 50; j < 100; j++){
		X[i][j] = 35;
	    }
	}

	int A = scan.nextInt();
	int B = scan.nextInt();
	
	for(int i = 1; i < 99; i++){
	    for(int j = 51; j < 99; j++){
		if(A > 0){
		    X[i][j] = 46;
		    A--;
		}else{
		    break;
		}
	    }
	    if(A > 0){
	    }else{
		break;
	    }
	}

	for(int i = 1; i < 99; i++){
	    for(int j = 1; j < 49; j++){
		if(B > 0){
		    X[i][j] = 35;
		    B--;
		}else{
		    break;
		}
	    }
	    if(B > 0){
	    }else{
		break;
	    }
	}

	for(int i = 0; i < 100; i++){
	    for(int j = 0; j < 100; j++){
		System.out.print((char)X[i][j]);
	    }
	    System.out.println();
	}
    }
}
