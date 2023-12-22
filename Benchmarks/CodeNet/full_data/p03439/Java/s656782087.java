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
    /*
    for (int i = 0; i <= this.seats.length; i++) {
      System.err.printf("%2d: %s\n", i, this.seats[i % this.seats.length]);
    }
    System.err.println();
    */
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
  enum Gender {
    MALE,
    FEMALE,
    VACANT
  }
  
  JudgeWrapper judgeWrapper;
  int n;
  
  Solver(JudgeWrapper judgeWrapper) {
    this.judgeWrapper = judgeWrapper;
  }
  
  private Gender ask(int seatIndex) {
    String genderString = judgeWrapper.putQuery(String.format("%d", seatIndex));
    if (genderString.equals("Male")) {
      return Gender.MALE;
    } else if (genderString.equals("Female")) {
      return Gender.FEMALE;
    } else {
      return Gender.VACANT;
    }
  }
  
  public void solve() {
    String judgeResponse = judgeWrapper.putQuery(null);
    n = Integer.parseInt(judgeResponse);
    
    int minIndex = 0;
    int maxIndex = n;
    Gender minGender = ask(0);
    if (minGender == Gender.VACANT) {
      return;
    }
    Gender maxGender = minGender;
    while (true) {
      int midIndex = (maxIndex + minIndex) / 2;
      Gender midGender = ask(midIndex);
      if (midGender == Gender.VACANT) {
        return;
      }
      
      int count = maxIndex - minIndex - 1;
      int countMinSide = midIndex - minIndex - 1;
      int countMaxSide = maxIndex - midIndex - 1;
      /*
      System.err.printf(
        "MinIndex: %d, MidIndex: %d, MaxIndex: %d, " +
        "CountMinSide: %d, CountMaxSide: %d, " +
        "MinGender: %s, MidGender: %s, MaxGender: %s\n",
        minIndex,
        midIndex,
        maxIndex,
        countMinSide,
        countMaxSide,
        minGender,
        midGender,
        maxGender
      );
      */
      
      if (midGender == minGender && countMinSide % 2 == 0) {
        maxIndex = midIndex;
        maxGender = midGender;
      } else if (midGender == maxGender && countMaxSide % 2 == 0) {
        minIndex = midIndex;
        minGender = midGender;
      } else if (midGender != minGender && countMinSide % 2 == 1) {
        maxIndex = midIndex;
        maxGender = midGender;
      } else if (midGender != maxGender && countMaxSide % 2 == 1) {
        minIndex = midIndex;
        minGender = midGender;
      } else {
        throw new RuntimeException();
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

