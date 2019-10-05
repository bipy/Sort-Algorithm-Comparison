public class InsertionSort extends SortAlgorithm{
    @Override
    public void run(int[] a) {
        int i, j, k;
        for (i = 1; i < a.length; i++) {
            k = a[i];
            j = i - 1;
            while (j >= 0 && a[j] > k) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = k;
        }
    }
}
