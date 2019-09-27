public class InsertionSort implements SortingAlgorithm {
    @Override
    public void sort(int[] a) {
        for (int index = 1; index < a.length; ++index) {
            //loop to go through the list.
            int value = a[index];
            int prev = index - 1;

            while (prev >= 0 && a[prev] > value) {
                //loop backwards through the values the main loop already passed. Move elemets up a spot as long as they
                // are bigger than the new number.
                a[prev + 1] = a[prev];
                prev -= 1;
            }
            //Final move up
            a[prev + 1] = value;
        }
    }
}
