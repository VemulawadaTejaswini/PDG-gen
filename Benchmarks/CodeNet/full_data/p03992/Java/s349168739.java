public class Main {
    public String A(String str) {
 
			char[] str_a = str.toCharArray();
			boolean flag = true;
			char[] str_1 = new char[4];
			char[] str_2 = new char[8];
 
				for (int i=0;i<4;i++){
					str_1[i] = str_a[i];
				}
				for (int i=4;i<str_a.length;i++){
					str_2[i-4] = str_a[i];
				}
 
				String a = new String(str_1);
				String b = new String(str_2);
				String c = a+"\0"+b+"\0";
				return c;
 
    }
}