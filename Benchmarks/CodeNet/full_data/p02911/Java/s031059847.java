
import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{
		 Scanner sc=new Scanner(System.in);  
	
		 int n = sc.nextInt();//n名玩家
		 int k = sc.nextInt();//各位的初始分数
		 int q = sc.nextInt();//共有q个正确答案
		 int[] correct  =  new int[q];//哪个人答对了的
		 for(int a=0;a<q;++a)
		 {
			 correct[a] = sc.nextInt();
		 }
		 
		 int[] score = new int[n];
		 for(int a=0;a<n;++a)
		 {
			 score[a] =k;
		 }
		 
		 
		 for(int b=0;b<q;++b)
		 {
			 for(int c=0;c<score.length;++c)
			 {
				 if(c!=correct[b]-1)
				 {
					 --score[c];
				 }
			 }
			 
		 }
		 
		 String[] arr = new String[n];
		 for(int b=0;b<score.length;++b)
		 {
			 if(score[b]>0)
			 {
				 arr[b]="Yes";
			 }
			 else
				 arr[b]="No";
			 
		 }
		 for(int b=0;b<score.length;++b)
		 {
			 System.out.println(arr[b]);
			 
		 }
		 }

		 }
	