
public class MinMaxInArrY {

    public static void main(String[] args) {
        int[] array = {4, 7, 1, 8, 5};
        int largest = array[0];
        int smallest = array[0];

        for (int num : array) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }

        System.out.println("Largest: " + largest + ", Smallest: " + smallest);
    }
}
