import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String B[] = a.split("");
		List<String> list = new ArrayList<String>(Arrays.asList(B));
		list.add("0");
		list.add("0");
		list.add("0");
		list.add("0");
		list.add("0");
		list.add("0");
		list.add("0");
        String[] A = list.toArray(new String[list.size()]);


		int x=0;
		int flag=0;
		while(true) {
			flag=0;
			if (A[x].equals("d")&&A[x+1].equals("r")&&A[x+2].equals("e")&&A[x+3].equals("a")&&A[x+4].equals("m")){
				if ((A[x+5].equals("e")&&A[x+6].equals("r")&&A[x+7].equals("a"))||A[x+5].equals("d")||A[x+5].equals("0")) {
					a=a.substring(5);
					x+=5;
					flag=1;
				}else if (A[x+5].equals("e")&&A[x+6].equals("r")&&(A[x+7].equals("e")||A[x+7].equals("d")||A[x+7].equals("0"))) {
					a=a.substring(7);
					x+=7;
					flag=1;
				}
			}else if (A[x].equals("e")&&A[x+1].equals("r")&&A[x+2].equals("a")&&A[x+3].equals("s")&&A[x+4].equals("e")) {
				if (A[x+5].equals("r")) {
					a=a.substring(6);
					x+=6;
					flag=1;
				}else if(A[x+5].equals("0")||((A[x+5].equals("e"))||A[x+5].equals("d"))) {
					a=a.substring(5);
					x+=5;
					flag=1;
				}
			}
			if (flag==0) {
				break;
			}
		}
		if (a.equals("")) {
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}
	}
}