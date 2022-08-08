import java.util.Date;

public class MatrixMultiplicationParallel {

    public static void main(String[] args) {

        Date start = new Date();

        int[][] m1 = MatrixGenerator.generateMatrix(2, 2);
        int[][] m2 = MatrixGenerator.generateMatrix(2, 2);

        int[][] result = new int[m1.length][m2[0].length];
        ParallelThreadsCreator.multiply(m1, m2, result);

        Date end = new Date();
        System.out.println("\n solving time in milli seconds: " + (end.getTime() - start.getTime()));
        MatrixGenerator.print(m1);
        MatrixGenerator.print(m2);
        MatrixGenerator.print(result);
    }
}
