import java.util.*;

interface JudgeInterface {
  String putQuery(String query);
}

class ExternalJudge implements JudgeInterface {
  final Scanner scanner;
  
  ExternalJudge() {
    scanner = new Scanner(System.in);
  }
  
  public String putQuery(String query) {
    if (query != null) {
      System.out.println(query);
    }
    return scanner.nextLine();
  }
}

class Judge implements JudgeInterface {
  final String[] seats;
  
  boolean first;
  int count;
  
  Judge(String[] seats) {
    this.seats = seats;
    this.count = 0;
    first = false;
  }
  
  public String putQuery(String query) {
    if (count >= 20) {
      throw new RuntimeException();
    }
    if (!first) {
      first = true;
      return "" + seats.length;
    }
    count++;
    return seats[Integer.parseInt(query)];
  }
}

class JudgeWrapper {
  JudgeInterface judgeInterface;
  
  JudgeWrapper(JudgeInterface judgeInterface) {
    this.judgeInterface = judgeInterface;
  }
  
  String putQuery(String query) {
    System.err.println("Query: " + query);
    String judgeResponse = judgeInterface.putQuery(query);
    System.err.println("Judge: " + judgeResponse);
    return judgeResponse;
  }
}

class Solver {
  JudgeWrapper judgeWrapper;
  int n;
  
  Solver(JudgeWrapper judgeWrapper) {
    this.judgeWrapper = judgeWrapper;
  }
  
  private String ask(int seatIndex) {
    return judgeWrapper.putQuery(String.format("%d", seatIndex));
  }
  
  public void solve() {
    String judgeResponse = judgeWrapper.putQuery(null);
    n = Integer.parseInt(judgeResponse);
    
    int minSeatIndex = 0;
    int maxSeatIndex = n;
    String minSeatState = ask(0);
    if (minSeatState.equals("Vacant")) {
      return;
    }
    String maxSeatState = minSeatState;
    while (true) {
      int midSeatIndex = (maxSeatIndex + minSeatIndex) / 2;
      String midSeatState = ask(midSeatIndex);
      if (midSeatState.equals("Vacant")) {
        return;
      }
      
      if (midSeatIndex - minSeatIndex == 1) {
        minSeatIndex = midSeatIndex;
      } else if ((midSeatIndex - minSeatIndex) % 2 == 1 && midSeatState.equals(minSeatState)) {
        maxSeatIndex = midSeatIndex;
      } else if ((midSeatIndex - minSeatIndex) % 2 == 0 && !midSeatState.equals(minSeatState)) {
        maxSeatIndex = midSeatIndex;
      } else {
        minSeatIndex = midSeatIndex;
      }
    }
  }
}

class Main {
  public static void main(String[] args) {
    /*
    JudgeInterface judgeInterface = new Judge(
      new String[]{
        "Male",
        "Female",
        "Male",
        "Female",
        "Male",
        "Female",
        "Male",
        "Female",
        "Male",
        "Female",
        "Male",
        "Female",
        "Male",
        "Female",
        "Male",
        "Female",
        "Vacant",
      }
    );
    */
    JudgeInterface judgeInterface = new ExternalJudge();
    JudgeWrapper judgeWrapper = new JudgeWrapper(judgeInterface);
    Solver solver = new Solver(judgeWrapper);
    solver.solve();
  }
}

