package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) throws UnsupportedOperationException {
        int s = 0;
        int nine = 0;
        for (int i = 0; i < lengthOfLastNumber; i++) {
//            System.out.print(nine * 10 + 9 + " ");
            nine = nine * 10 + 9;
            s += nine;
        }
        System.out.println(s);

    }

//    public static void main(String[] args) {
//        int lengthOfLastNumber = 5;
//        int s = 0;
//        int nine = 0;
//        for (int i = 0; i < lengthOfLastNumber; i++) {
//            System.out.print(nine * 10 + 9 + " ");
//            nine = nine * 10 + 9;
//            s += nine;
//        }
//        System.out.println(s);
//    }
}
