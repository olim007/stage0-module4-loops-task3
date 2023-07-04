package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        if (first > second) {
            first = first ^ second;
            second = second ^ first;
            first = first ^ second;
        }

        for (int i = first; i >= 0; i--) {
            if (i == 0) {
                System.out.println(second);
                return;
            }
            if (second % i == 0 && first % i == 0) {
                System.out.println(i);
                return;
            }

        }
    }

    public static void main(String[] args) {
        int first = 12;
        int second = 43;
        first = first ^ second;
        second = second ^ first;
        first = first ^ second;
        System.out.println(first + " " + second);
    }
}
