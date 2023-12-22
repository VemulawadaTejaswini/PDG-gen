import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      String n = sc.next();
      int k = sc.nextInt();
      Set<Integer> digitSet = new HashSet<>();
      for(int i = 0; i < k; i++)
        digitSet.add(sc.nextInt());

      char[] charArr = n.toCharArray();
      int[] numArr = new int[charArr.length];
      for(int i = 0; i < charArr.length; i++)
        numArr[i] = charArr[i] - '0';

      int carry = 0;
      for(int i = numArr.length - 1; i >= 0; i--) {
        int num = numArr[i] + carry;
        carry = num / 10;
        num %= 10;
        while(digitSet.contains(num)) {
          num++;
          if(num == 10) {
            carry = 1;
            num = 0;
          }
        }
        if(carry != 0) {
          for(int j = i; j < numArr.length; j++) {
            int nu = 0;
            while(digitSet.contains(nu))
                nu++;
            numArr[j] = nu;
          }
        } else
          numArr[i] = num;
      }
      StringBuilder sb = new StringBuilder();
      if(carry != 0) {
          while(digitSet.contains(carry))
            carry++;
          sb.append(carry);
          for(int i = 0; i < numArr.length; i++) {
            int num = 0;
            while(digitSet.contains(num))
              num++;
            sb.append(num);  
          }
      } else {
          for(int num : numArr)
            sb.append(num);
      }
      System.out.println(sb.toString());
  }
}