public class MultiplesNumber {
    int[] arrayOfMultiplesNumber = {3, 5};
    int sum = 0;

    public int sumOfMultiplesNumber(int border) {

        for (int i = 0; i < border; i++) {
            for (int j = 0; j < arrayOfMultiplesNumber.length; j++) {
                if (i % arrayOfMultiplesNumber[j] == 0) {
                    sum += i;
                    break;
                }
            }
        }
        return sum;
    }

}
