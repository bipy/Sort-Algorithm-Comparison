import java.util.Random;

public class RandomizedQuickSort extends SortAlgorithm {
    private Random random = new Random();

    @Override
    public void run(int[] a) {
        QuickSort(a, 0, a.length - 1);
    }

    private int Randomized_Partition(int[] a, int p, int r) {
        int i = random.nextInt(r - p) + p;
        swap(a, i, r);
        return Partition(a, p, r);
    }

    private void swap(int[] a, int i, int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    private int Partition(int[] a, int p, int r) {
        int x = a[r];
        int i = p - 1;
        for (int j = p; j < r; j++) {
            if (a[j] <= x) {
                i++;
                swap(a, i, j);
            }
        }
        swap(a, i + 1, r);
        return i + 1;
    }

    private void QuickSort(int[] a, int p, int r) {
        if (p < r) {
            int q = Randomized_Partition(a, p, r);
            QuickSort(a, p, q - 1);
            QuickSort(a, q + 1, r);
        }
    }
}
