public class BubbleSort extends SortAlgorithm {
    @Override
    public void run(int[] a) {
        for (int i = 0; i < a.length; i++) {
            Boolean isOrdered = true;
            for (int j = 1; j < a.length - i; j++) {
                if (a[j - 1] > a[j]) {
                    isOrdered = false;
                    int t = a[j - 1];
                    a[j - 1] = a[j];
                    a[j] = t;
                }
            }
            if (isOrdered) {
                break;
            }
        }
    }
}
