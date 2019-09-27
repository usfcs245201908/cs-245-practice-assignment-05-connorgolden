public class QuickSort implements SortingAlgorithm {
    @Override
    public void sort(int[] a) {
        quickSort(a, 0, a.length-1);
    }

    void quickSort(int[] a, int begin, int end) {
        if (begin < end) {
            int p_index = partition(a, begin, end);
            quickSort(a, begin, p_index-1);
            quickSort(a, p_index+1, end);
        }
    }

    int partition(int[] a, int begin, int end) {
        int pivot = a[end]; //pivot starting at end
        int i = (begin-1);

        for (int j = begin; j < end; j++) {
            if (a[j] <= pivot) {
                i++;

                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }

        int swapTemp = a[i+1];
        a[i+1] = a[end];
        a[end] = swapTemp;

        return i+1;
    }
}