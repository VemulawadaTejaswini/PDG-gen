import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] times = new int[n + 1];
		int[] velocities = new int[n + 2];
		for (int i = 1; i <= n; i++) {
		    times[i] = sc.nextInt();
		}
		for (int i = 1; i <= n; i++) {
		    velocities[i] = sc.nextInt();
		}
		for (int i = n; i >= 1; i--) {
		    velocities[i] = Math.min(velocities[i], velocities[i + 1] + times[i]);
		}
		for (int i = 1; i <= n; i++) {
		    velocities[i] = Math.min(velocities[i], velocities[i - 1] + times[i]);
		}
		double total = 0;
		for (int i = 1; i <= n; i++) {
		    if (velocities[i - 1] < velocities[i]) {
		        if (velocities[i + 1] < velocities[i]) {
		            total += bothCalc(times[i], velocities[i - 1], velocities[i], velocities[i + 1]);
		        } else {
		            total += leftCalc(times[i], velocities[i - 1], velocities[i]);
		        }
		    } else {
		        if (velocities[i + 1] < velocities[i]) {
		            total += rightCalc(times[i], velocities[i], velocities[i + 1]);
		        } else {
		            total += velocities[i] * times[i];
		        }
		    }
		}
		System.out.println(total);
    }
    
    static double leftCalc(double time, double min, double max) {
        return (2 * time - (max - min)) / 2 * (max - min) + min * time;
    }

    static double rightCalc(double time, double max, double min) {
        return leftCalc(time, min, max);
    }
    
    static double bothCalc(double time, double left, double max, double right) {
        if (left > right) {
            return bothCalc(time, right, max, left);
        }
        if (max - left + max - right <= time) {
            return leftCalc(max - left, left, max) + rightCalc(time - (max - left), max, right);
        }
        return leftCalc(right - left, left, right) + Math.pow(time - (right - left), 2) / 4 + right * (time - (right - left));
    }
    
    
}

