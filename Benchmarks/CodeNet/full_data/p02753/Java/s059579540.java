public class Main {
    public static void main(String args[]) {
      	Scanner sc = new Scanner(System.in);
		String S = sc.next();
      	String[] strArray = S.split("");
      	int a, b = 0;
      	for (int i = 0; i < strArray.length; i++) {
    		if(strArray[i]=="A"){
              	a++;
            } else if (strArray[i]=="B"){
            	b++;
            }
		}
      	if(a==3||b==3)System.out.println("Yes");
      	else System.out.println("No");
    }
}