public class Solution {
    public String A(String s) {
    		if (str.length()==12){
			char[] str_a = str.toCharArray();
			boolean flag = true;
			char[] str_1 = new char[4];
			char[] str_2 = new char[8];
			for (int i=1;i<str_a.length;i++){
				if (str_a[i]>=55 && str_a[i]<=90){
					flag = true;
				}
				else{
					flag = false;
					break;
				}
			}
			if(flag == true){
				for (int i=0;i<4;i++){
					str_1[i] = str_a[i];
				}
				for (int i=4;i<str_a.length;i++){
					str_2[i-4] = str_a[i];
				}

				String a = new String(str_1);
				String b = new String(str_2);
				String c = a+" "+b;
				return c
			}
                        else{
                            return null;
                        }
		}   
                else {
                     return null;    
                } 
    }
}