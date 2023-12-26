public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      String[] t=sc.nextLine().split("");
String tem="";
for(int i=0;i<t.length;i++){
switch(t[i]){
case "0":
tem+="0";
break;
case "1":
tem+="1";
break;
case "B":
String[] te=tem.split("");
tem="";
for(int j=0;j<te.length-1;j++){
tem+=te[j];
}
break;
default:
break;
}
}
System.out.println(tem);
	}
}
