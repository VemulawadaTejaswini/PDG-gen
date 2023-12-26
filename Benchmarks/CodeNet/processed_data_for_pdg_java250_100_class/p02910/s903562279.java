public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
        int l=s.length();
        String o="Yes";
        for (int i=0;2*i+1<=l;i++){	
            char a=s.charAt(2*i);
            if(a=='R' || a=='U' ||a=='D' ){
            }else{
                o="No";
                break;
            }
        }
        if(o.equals("Yes")){
            for (int i=0;2*i+2<=l;i++){	
                char a=s.charAt(2*i+1);
                if(a=='L' || a=='U' ||a=='D' ){
                }else{
                    o="No";
                    break;
                }
            }
        }
          System.out.println(o);
      }
}
