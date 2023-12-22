import java.util.*;
public class Main {
  public static int count(String target, String string) {
    return (target.length() - target.replaceAll(string, "").length())/string.length();
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.nextLine());
    int days=0;
    ArrayList<String> business_days = new ArrayList<>();
    ArrayList<Integer> business_day = new ArrayList<>();
    ArrayList<String> revenues = new ArrayList<>();
    ArrayList<Integer[]> revenue = new ArrayList<>();
    for (int i=0; i<n; i++) {
      business_days.add(sc.nextLine());
    }
    for (int i=0; i<n; i++) {
      revenues .add(sc.nextLine());
    }
    for (String str: business_days) {
      business_day.add(count(str, "1"));
    }
    for (int j=0; j<business_day.size();  j++) {
      Integer[] high_profit = {null, null};
      String[] rev = revenues.get(j).split(" ", -1);
      int day=0;
      for (int i=0; i<business_day.get(j)+1;  i++) {
        if (high_profit[0] == null) {
          high_profit[0] = Integer.parseInt(rev[i]);
          day = i;
          continue;
        }
        if (high_profit[1] == null) {
          if (high_profit[0]<Integer.parseInt(rev[i])) {
            high_profit[1] = high_profit[0];
            high_profit[0] = Integer.parseInt(rev[i]);
            day = i;
          } else {
            high_profit[1] = Integer.parseInt(rev[i]);
          }
          continue;
        }
        if (high_profit[0]<Integer.parseInt(rev[i])) {
          high_profit[1] = high_profit[0];
          high_profit[0] = Integer.parseInt(rev[i]);
          day = i;
        }
      }
    days += day;
    revenue.add(high_profit);
    }
    int total=0;
    if (days != 0) {
      for (Integer[] rev: revenue) {
        total += rev[0];
      }
    } else {
      total = revenue.get(0)[1];
      for (Integer[] rev: revenue) {
        if (total<rev[1]) {
          total = rev[1];
        }
      }
    }
    System.out.println(total);
  }
}