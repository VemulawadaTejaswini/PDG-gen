import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        int M = scan.nextInt();
        List<Student> students = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            Student student = new Student();
            student.a = scan.nextInt();
            student.b = scan.nextInt();
            students.add(student);
        }
        List<CheckPoint> points = new ArrayList<>();
        for (int i = 0; i < M; i++) {
            CheckPoint point = new CheckPoint();
            point.c = scan.nextInt();
            point.d = scan.nextInt();
            points.add(point);
        }
        for (int i = 0; i < N; i++) {
            int nearest_point = Integer.MAX_VALUE;
            int nearest_distance = Integer.MAX_VALUE;
            for (int j = 0; j < M; j++) {
                int distance = points.get(j).distance(students.get(i));
                if (distance < nearest_distance) {
                    nearest_distance = distance;
                    nearest_point = j;
                }
            }
            System.out.println(nearest_point+1);
        }
    }
    class Student {
        int a;
        int b;
    }
    class CheckPoint {
        int c;
        int d;
        int distance(Student student) {
            return Math.abs(student.a - this.c) + Math.abs(student.b - this.d);
        }
    }
}
