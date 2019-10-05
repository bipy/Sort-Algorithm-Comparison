import java.util.Random;

public class SortTest {
    //测试数据
    private int[][] seq = new int[7][];
    //时间统计
    private int[][] time = new int[7][7];
    //算法
    private SortAlgorithm[] algo;
    //无序率
    private double unordered = 0.05;

    public SortTest() {
        Random random = new Random();
        //Case 0
        seq[0] = random.ints(1, 0, 1000).toArray();
        //Case 1
        seq[1] = random.ints(11, 0, 1000).toArray();
        //Case 2
        seq[2] = random.ints(100000, 0, 1000).toArray();
        //Case 3
        seq[3] = random.ints(100000, -10000, 10000).toArray();
        //Case 4
        seq[4] = new int[100000];
        seq[4][0] = -50000;
        //Case 5
        seq[5] = new int[100000];
        seq[5][0] = 50000;
        //Case 6
        seq[6] = new int[100000];
        seq[6][0] = -50000;
        for (int i = 1; i < 100000; i++) {
            seq[4][i] = seq[4][i - 1] + (random.nextInt(2) * random.nextInt(5));
            seq[5][i] = seq[5][i - 1] - (random.nextInt(2) * random.nextInt(5));
            seq[6][i] = seq[6][i - 1] + (random.nextInt(2) * random.nextInt(5));
        }

        for (int i = 0; i < 100000 * unordered; i++) {
            int Pos = random.nextInt(100000);
            int Value = random.nextInt(100000) - 50000;
            seq[6][Pos] = Value;
        }
        this.algo = new SortAlgorithm[]{
                new RandomizedQuickSort(),
                new QuickSort(),
                new HeapSort(),
                new MergeSort(),
                new BubbleSort(),
                new InsertionSort(),
                new LibSort()
        };
    }

    public static void main(String[] args) {
        SortTest thisOne = new SortTest();
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                if (j == 1 && (i == 4 || i == 5)) {//Quick Sort在完全有序时StackOverFlowError，故略过
                    continue;
                }
                long start = System.currentTimeMillis();
                thisOne.algo[j].run(thisOne.seq[i].clone());
                thisOne.time[i][j] = (int) (System.currentTimeMillis() - start);
            }
        }
        for (int i = 0; i < 7; i++) {
            System.out.print(String.format("%5d ", i));
            for (int j = 0; j < 7; j++) {
                if (j == 1 && (i == 4 || i == 5)) {//Quick Sort在完全有序时StackOverFlowError，故略过
                    System.out.print(String.format("%5s ", "-"));
                    continue;
                }
                System.out.print(String.format("%5d ", thisOne.time[i][j]));
            }
            System.out.println();
        }
    }
}

