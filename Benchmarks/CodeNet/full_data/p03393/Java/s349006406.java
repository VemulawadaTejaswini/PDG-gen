import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		final String finalWord = "zyxwvutsrqponmlkjihgfedcba";
		String word =sc.nextLine();
		String[] words = word.split("");
		int[] exist = new int[26];
		for(int i=0;i<26;i++){
			exist[i]=-1;
		}
		for(int i=0;i<words.length;i++){
			if(words[i].equals("a")){
				exist[0]=i;
			}else if(words[i].equals("b")){
				exist[1]=i;
			}else if(words[i].equals("c")){
				exist[2]=i;
			}else if(words[i].equals("d")){
				exist[3]=i;
			}else if(words[i].equals("e")){
				exist[4]=i;
			}else if(words[i].equals("f")){
				exist[5]=i;
			}else if(words[i].equals("g")){
				exist[6]=i;
			}else if(words[i].equals("h")){
				exist[7]=i;
			}else if(words[i].equals("i")){
				exist[8]=i;
			}else if(words[i].equals("j")){
				exist[9]=i;
			}else if(words[i].equals("k")){
				exist[10]=i;
			}else if(words[i].equals("l")){
				exist[11]=i;
			}else if(words[i].equals("m")){
				exist[12]=i;
			}else if(words[i].equals("n")){
				exist[13]=i;
			}else if(words[i].equals("o")){
				exist[14]=i;
			}else if(words[i].equals("p")){
				exist[15]=i;
			}else if(words[i].equals("q")){
				exist[16]=i;
			}else if(words[i].equals("r")){
				exist[17]=i;
			}else if(words[i].equals("s")){
				exist[18]=i;
			}else if(words[i].equals("t")){
				exist[19]=i;
			}else if(words[i].equals("u")){
				exist[20]=i;
			}else if(words[i].equals("v")){
				exist[21]=i;
			}else if(words[i].equals("w")){
				exist[22]=i;
			}else if(words[i].equals("x")){
				exist[23]=i;
			}else if(words[i].equals("y")){
				exist[24]=i;
			}else if(words[i].equals("z")){
				exist[25]=i;
			}
		}
		if(words.length==26){
			if(word.equals(finalWord)){
				System.out.println(-1);
			}else{
				char[] c = word.toCharArray();
				int point=-1;
				for(int i=1;i<26;i++){
					if(c[25]>c[25-i]){
						point=25-i;
						break;
					}
				}
				String str="";
				for(int i=0;i<point;i++){
					str=str+words[i];
				}
				str=str+words[25];
				if(point==-1){
					String s="";
					for(int i=0;i<26;i++){
						if(exist[i]==0){
							i=i+1;
							if(i==0){
								s="a";
							}else if(i==1){
								s="b";
							}else if(i==2){
								s="c";
							}else if(i==3){
								s="d";
							}else if(i==4){
								s="e";
							}else if(i==5){
								s="f";
							}else if(i==6){
								s="g";
							}else if(i==7){
								s="h";
							}else if(i==8){
								s="i";
							}else if(i==9){
								s="j";
							}else if(i==10){
								s="k";
							}else if(i==11){
								s="l";
							}else if(i==12){
								s="m";
							}else if(i==13){
								s="n";
							}else if(i==14){
								s="o";
							}else if(i==15){
								s="p";
							}else if(i==16){
								s="q";
							}else if(i==17){
								s="r";
							}else if(i==18){
								s="s";
							}else if(i==19){
								s="t";
							}else if(i==20){
								s="u";
							}else if(i==21){
								s="v";
							}else if(i==22){
								s="w";
							}else if(i==23){
								s="x";
							}else if(i==24){
								s="y";
							}else if(i==25){
								s="z";
							}							
							break;
						}
					}
					
					System.out.println(s);
				}else{System.out.println(str);}
			}
		}else{
			for(int i=0;i<26;i++){
				if(exist[i]==-1){
					String s="";
					if(i==0){
						s="a";
					}else if(i==1){
						s="b";
					}else if(i==2){
						s="c";
					}else if(i==3){
						s="d";
					}else if(i==4){
						s="e";
					}else if(i==5){
						s="f";
					}else if(i==6){
						s="g";
					}else if(i==7){
						s="h";
					}else if(i==8){
						s="i";
					}else if(i==9){
						s="j";
					}else if(i==10){
						s="k";
					}else if(i==11){
						s="l";
					}else if(i==12){
						s="m";
					}else if(i==13){
						s="n";
					}else if(i==14){
						s="o";
					}else if(i==15){
						s="p";
					}else if(i==16){
						s="q";
					}else if(i==17){
						s="r";
					}else if(i==18){
						s="s";
					}else if(i==19){
						s="t";
					}else if(i==20){
						s="u";
					}else if(i==21){
						s="v";
					}else if(i==22){
						s="w";
					}else if(i==23){
						s="x";
					}else if(i==24){
						s="y";
					}else if(i==25){
						s="z";
					}
					word=word+s;
					System.out.println(word);
					break;
				}
			}
		}
		
	}
}
