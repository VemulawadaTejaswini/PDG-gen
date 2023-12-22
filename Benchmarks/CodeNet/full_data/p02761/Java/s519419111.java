import java.util.*;
	class Main{
		public static void main(String args[]){
			Scanner sc = new Scanner(System.in);
     		int n = sc.nextInt(), m = sc.nextInt();
          	int[] s = new int[m];
          int[] t= new int[m];
          for (int i = 0; i< m; i++){
          	s[i] = sc.nextInt(); t[i] = sc.nextInt();
          }
          StringBuilder sb = new StringBuilder();
          for (int i = 1; i<= m; i++)
            sb.append("0");
          for (int i = 0; i < m; i++){
          	sb.replace(s[i], s[i] + 1, String.valueOf(t[i]));
                      //~ System.out.println(sb.toString());

          }
          String ss = sb.toString();
          if (m == 0)
						System.out.println(-1);

          else if (ss.charAt(1) == '0')
            System.out.println(-1);
          else{
						for (int i= 1 ; i< ss.length(); i++)
            System.out.print(ss.charAt(i));
            }
          
        }
    }
