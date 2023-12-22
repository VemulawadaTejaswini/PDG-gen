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
    
    int minIndex = 0;
    int maxIndex = n;
    String minState = ask(0);
    if (minState.equals("Vacant")) {
      return;
    }
    String maxState = minState;
    while (true) {
      int midIndex = (maxIndex + minIndex) / 2;
      if ((maxIndex - minIndex) % 2 == 0 && maxIndex - minIndex > 2) {
        if (midIndex + 1 < maxIndex) {
          midIndex++;
        } else {
          midIndex--;
        }
      }
      
      String midState = ask(midIndex);
      if (midState.equals("Vacant")) {
        return;
      }
      
      System.err.printf("min: %d %s, mid: %d, %s, max: %d %s\n", minIndex, minState, midIndex, midState, maxIndex, maxState);
      if (midIndex - minIndex == 1) {
        minIndex = midIndex;
      } else if (maxIndex - midIndex == 1) {
        maxIndex = midIndex;
      } else if ((maxIndex - midIndex) % 2 == 1) {
        if (maxState.equals(midState)) {
          minIndex = midIndex;
        } else {
          maxIndex = midIndex;
        }
      } else {  // (midIndex - minIndex) % 2 == 1
        if (minState.equals(midState)) {
          maxIndex = midIndex;
        } else {
          minIndex = midIndex;
        }
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
        "Vacant",
        "Female",
        "Male",
        "Female",
        "Vacant",
        "Vacant",
        "Male",
        "Female",
        "Male",
        "Female",
        "Male",
        "Female",
        "Male",
        "Female",
      }
    );
    */
    JudgeInterface judgeInterface = new ExternalJudge();
    JudgeWrapper judgeWrapper = new JudgeWrapper(judgeInterface);
    Solver solver = new Solver(judgeWrapper);
    solver.solve();
  }
}

