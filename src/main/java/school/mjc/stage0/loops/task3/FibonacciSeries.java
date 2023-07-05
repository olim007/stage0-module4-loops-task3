package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int t0 = 0;
        int t1 = 1;
        int s = 0;
        System.out.println(t0);
        System.out.println(t1);
        for (int i = 0; i < lastFibonacci - 2; i++) {
            s = t0 + t1;
            t0 = t1;
            t1 = s;
            System.out.println(s);
        }
    }
//      1, 1, 2, 3, 5, 8, 13, 21, 34 ...
//    public static void main(String[] args) {
//        int lastFibonacci = 5;
//        int t0 = 0;
//        int t1 = 1;
//        int s = 0;
//        System.out.println(t0);
//        System.out.println(t1);
//        for (int i = 0; i < lastFibonacci - 2; i++) {
//            s = t0 + t1;
//            t0 = t1;
//            t1 = s;
//            System.out.println(s);
//        }
//    }
}
