package com.company;
import java.util.*;
import java.lang.*;

public class Main {

    public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	Scanner sc1=new Scanner(System.in);
	int i,j,k,flag;
	i=sc.nextInt();
	j=sc.nextInt();
	k=sc.nextInt();
	if(i==j && i==k && j==k)
		System.out.println("No");
	else
		System.out.println("Yes");
		
    }
}
