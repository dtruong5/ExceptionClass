public class Average {
    //initialize public global variable average
    public static int average;
    public static void main(String[] args) {
        try {
            printAverage(100, 0);
        }catch(ArithmeticException | IntegerDivisionByZeroException e){
            System.out.println(e.getLocalizedMessage());
            System.out.println("Exception handled in main()");
        }
        System.out.println("Exit main().");
    }
    public static void printAverage (int totalSum, int totalNumber) throws IntegerDivisionByZeroException {
        try {
            average = computeAverage(totalSum, totalNumber);
        } catch (IllegalAccessError | IntegerDivisionByZeroException e) {
            System.out.println(e.getLocalizedMessage());
            totalNumber = 1;
            average = computeAverage(totalSum, totalNumber);
            System.out.println("Average = " + totalSum + "/" + totalNumber + "=" + average);
        } finally{
            System.out.println("Finally done.");
        }
        System.out.println("Exit printAverage().");
    }
    public static int computeAverage(int sum, int number) throws IntegerDivisionByZeroException {
        System.out.println("Computing average");
        if (number == 0) throw new IntegerDivisionByZeroException("Integer division by 0");
        return sum/number;
    }
}
