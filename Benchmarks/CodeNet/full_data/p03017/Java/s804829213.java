//ごみこーどちゅうい！

import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=scan.nextInt();
		int d=scan.nextInt();
		int f=scan.nextInt();
		String str=scan.next();
		int sunu=b-1;//配列対応
		int hunu=c-1;//配列対応
		if(d>f) {//とりあえず抜けすぬけ君！(完了)
			for(;;) {//ここで、ふぬけくんの±1をからにしよう！(完了)
				if(hunu==a-1) {
					System.out.println("No");
					return;
				}
				char ch3=' ';
				char ch1=str.charAt(hunu-1);
				char ch2=str.charAt(hunu+1);
				if(hunu<a-2) {
				ch3=str.charAt(hunu+2);}
				if(ch1=='.'&&ch2=='.') {
					break;
				}
				if(ch2=='.') {
					hunu++;
				}
				else {
					if(hunu<a-2) {
					if(ch3=='.') {
						hunu+=2;
					}
					else {
						System.out.println("No");
						return;
					}
					}
				}
			}
			sunu=hunu+1;
			if(sunu==d-1) {//壁突破しないように
				if(hunu==f-1) {
					System.out.println("Yes");
					return;
				}
			}
			for(;;) {//こっから一直線に走れ！！！まずはすぬけ君！
				char ch2=str.charAt(sunu+1);
				char ch3=' ';
				if(sunu<a-2) {
				ch3=str.charAt(sunu+2);
				}
				if(ch2=='.') {
					sunu++;
				}
				else {
					if(sunu<a-2) {
					if(ch3=='.') {
						sunu+=2;
					}
					else {
						System.out.println("No");
						return;
					}
					}
				}
				if(sunu==d-1) {//おめでとう！ゴールだ！
					break;
				}			
				}
			
			for(;;) {//つぎはふぬけ君！
				char ch2=str.charAt(hunu+1);
				char ch3=' ';
				if(hunu<a-2) {
				ch3=str.charAt(hunu+2);
				}
				if(ch2=='.') {
					hunu++;
				}
				else {
					if(hunu<a-2) {
					if(ch3=='.') {
						hunu+=2;
					}
					else {
						System.out.println("No");
						return;
					}
					}
				}
				if(hunu==f-1) {//おめでとう！ゴールだ！
					System.out.println("Yes");
					return;
				}			
				}
				
		}
		else {
			for(;;) {//こっから一直線に走れ！！！まずはふぬけ君！
				char ch2=str.charAt(hunu+1);
				char ch3=' ';
				if(hunu<a-2) {
				ch3=str.charAt(hunu+2);
				}
				if(ch2=='.') {
					hunu++;
				}
				else {
					if(hunu<a-2) {
					if(ch3=='.') {
						hunu+=2;
					}
					else {
						System.out.println("No");
						return;
					}
					}
				}
				if(hunu==f-1) {//おめでとう！ゴールだ！
					break;
				}			
				}
			
			for(;;) {//つぎはすぬけ君！
				char ch2=str.charAt(sunu+1);
				char ch3=' ';
				if(sunu<a-2) {
				ch3=str.charAt(sunu+2);
				}
				if(ch2=='.') {
					sunu++;
				}
				else {
					if(sunu<a-2) {
					if(ch3=='.') {
					sunu+=2;
					}
					else {
						System.out.println("No");
						return;
					}
					}
				}
				if(sunu==d-1) {//おめでとう！ゴールだ！
					System.out.println("Yes");
					return;
				}			
				}
				
		}
	}
}
