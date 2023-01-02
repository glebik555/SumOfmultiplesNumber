public class Main {
    public static void main(String[] args) {
        MultiplesNumber mn = new MultiplesNumber();
        int border = 1000;
        int sum = mn.sumOfMultiplesNumber(border);
        System.out.println("Sum of all multiples of 3 or 5 below " + border + " is " + sum);
    }
}
