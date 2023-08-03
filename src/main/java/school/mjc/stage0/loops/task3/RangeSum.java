package school.mjc.stage0.loops.task3;

public class RangeSum {
    public void printSumInclusive(int firstBoarder, int secondBoarder) throws UnsupportedOperationException {
        int s = 0;
        for (int i = firstBoarder; i <= secondBoarder; i++) {
            s += i;
        }
        System.out.println(s);
    }
}
