public class MergeSort extends SortAlgorithm{
    @Override
    public void run(int[] a) {
        int[] T = new int[a.length];
        MergeSort(a, 0, a.length, T);
    }

    private void MergeSort(int[] a, int x, int r, int[] T) {
        if (r - x > 1) {
            int m = (x + r) / 2;
            int i = x, q = m, p = x;
            MergeSort(a, x, m, T);
            MergeSort(a, m, r, T);
            while (p < m || q < r) {
                if (q >= r || (p < m && a[p] <= a[q]))
                    T[i++] = a[p++];
                else
                    T[i++] = a[q++];
            }
            for (i = x; i < r; i++) {
                a[i] = T[i];
            }
        }
    }
}
