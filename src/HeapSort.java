public class HeapSort extends SortAlgorithm {
    @Override
    public void run(int[] a) {
        int HeapSize = a.length;
        buildMaxHeap(a);
        for (int i = 0; i < a.length; i++) {
            swap(a, 0, HeapSize - 1);
            MaxHeapify(a, 0, --HeapSize);
        }
    }

    private int left(int x) {
        return 2 * x + 1;
    }

    private int right(int x) {
        return 2 * x + 2;
    }

    private void swap(int[] a, int x, int y) {
        int t = a[x];
        a[x] = a[y];
        a[y] = t;
    }

    private void MaxHeapify(int[] a, int i, int HeapSize) {
        int max, l, r;
        l = left(i);
        r = right(i);
        if (l < HeapSize && a[i] <= a[l]) {
            max = l;
        } else {
            max = i;
        }
        if (r < HeapSize && a[max] <= a[r]) {
            max = r;
        }
        if (max != i) {
            swap(a, max, i);
            MaxHeapify(a, max, HeapSize);
        }
    }

    private void buildMaxHeap(int[] a) {
        for (int i = (a.length - 1) / 2; i >= 0; i--) {
            MaxHeapify(a, i, a.length);
        }
    }
}
