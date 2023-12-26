public class Main{
    public static void main(String[] args){
	Scanner sc=new Scanner(in);
	String s=sc.next();
	String result="";
	for(int i=0;i<s.length();i++)
	    switch(s.substring(i,i+1)){
	    case "0":
		result+="0";
		break;
	    case "1":
		result+="1";
		break;
	    case "B":
        if(result.length()!=0)
		result=result.substring(0,result.length()-1);
		break;
	    }
	out.println(result);
    }
}
