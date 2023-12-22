import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Student[] ss = new Student[n];
        for (int i = 0; i < n; i++) {
            Student s = new Student();
            s.number = i + 1;
            s.order = in.nextInt();
            ss[i] = s;
        }

        Arrays.sort(ss);

        for (int i = 0; i < n; i++) {
            System.out.print(ss[i].number + " ");
        }
    }
}

class Student implements Comparable<Student> {
    int order;
    int number;

    @Override
    public int compareTo(Student o) {
        return this.order - o.order;
    }
}