public class MyMain {

    // Returns the number of odd numbers in mat
    public static int countOdds(int[][] mat) {
        int count = 0;
        for (int[] row: mat) {
            for (int col: row) {
                if (col % 2 != 0) {
                    count++;
                }
            }
        }
        return count;
    }

    // Returns the largest value in mat
    public static int findLargest(int[][] mat) {
        int largest = -Integer.MAX_VALUE;
        for (int[] row: mat) {
            for (int col: row) {
                if (col > largest) {
                    largest = col;
                }
            }
        }
        return largest;
    }

    // Write a method that "left-shifts" each row in a 2D array.
    // This means that for each row, all the numbers should be
    // shifted to the left by 1, with wraparound (the first value
    // should wrap around to the last entry in the row)
    public static int[][] leftShift(int[][] mat) {
        // YOUR CODE HERE
        for (int row = 0; row < mat.length; row++) {
            int[] newshift = new int[mat[row].length];
            for (int i = 0; i < mat[row].length; i++) {
                if (i == 0) {
                    newshift[mat[row].length-1] = mat[row][i];
                } else {
                    newshift[i-1] = mat[row][i];
                }
            }
            mat[row] = newshift;
        }


        return mat;
    }

    // Creates a new array list of size arraySize x arraySize
    // where each value is each to the sum of its row and col indexes
    public static int[][] arrayBuilder(int arraySize) {
        int[][] arv = new int[arraySize][arraySize];
        return null;
    }










    // Methods for the homework:

    // Returns the mean of the 2D array mat
    public static double mean(double[][] mat) {
        // YOUR CODE HERE
        return -1.0;
    }

    // Returns the median of the 2D array mat
    // Remember that the array is sorted!
    public static double median(double[][] mat) {
        // YOUR CODE HERE
        return -1.0;
    }


    // Returns the mode of the 2D array mat
    // Remember that the array is sorted!
    public static double mode(double[][] mat) {
        // YOUR CODE HERE
        return -1.0;
    }


    public static void main(String[] args) {
        // Write some code here to test your methods!
    }
}
