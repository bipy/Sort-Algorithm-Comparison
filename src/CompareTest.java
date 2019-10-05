import java.util.Random;

public class SortTest {
    private int[][] seq = new int[7][];
    private int[][] time=new int[7][6];
    private SortAlgorithm[] algo;
    private double unordered = 0.05;

    public SortTest() {
        Random random = new Random();
        seq[0] = random.ints(1, 0, 1000).toArray();
        seq[1] = random.ints(11, 0, 1000).toArray();
        seq[2] = random.ints(100000, 0, 1000).toArray();
        seq[3] = random.ints(100000, -1000, 1000).toArray();
        seq[4] = new int[100000];
        seq[5] = new int[100000];
        seq[6] = new int[100000];
        for (int i = 0; i < 100000; i++) {
            seq[4][i] = i;
            seq[5][i] = 99999 - i;
            seq[6][i] = i;
        }
        for (int i = 0; i <100000*unordered;i++){
            int Pos=random.nextInt(100000);
            int Value=random.nextInt(1000);
            seq[6][Pos]=Value;
        }
        this.algo =new SortAlgorithm[]{
                new RandomizedQuickSort(),
                new QuickSort(),
                new HeapSort(),
                new MergeSort(),
                new BubbleSort(),
                new InsertionSort()
        };
    }

    public static void main(String[] args) {
        SortTest thisOne=new SortTest();
//        for(int i=0;i<7;i++){
//            for(int j=0;j<6;j++){
//                long start=System.currentTimeMillis();
//                thisOne.algo[j].run(thisOne.seq[i]);
//                thisOne.time[i][j]=(int)(System.currentTimeMillis()-start);
//            }
//        }
//        for(int i=0;i<7;i++){
//            for(int j=0;j<6;j++){
//                System.out.print(String.format("%5d ",thisOne.time[i][j]));
//            }
//            System.out.println();
//        }
        long start=System.currentTimeMillis();
                thisOne.algo[1].run(thisOne.seq[3]);
                System.out.println((int)(System.currentTimeMillis()-start));
    }

}
