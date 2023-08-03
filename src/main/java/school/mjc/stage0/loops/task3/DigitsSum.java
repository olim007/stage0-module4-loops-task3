package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t) throws UnsupportedOperationException{
        t = Math.abs(t);
        String st = Integer.toString(t);
        int s = 0;
        for (int i = 0; i < st.length(); i++) {
            s += t % 10;
            t /= 10;
        }
        System.out.println(s);
    }
}
