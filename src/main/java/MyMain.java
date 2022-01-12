import java.util.ArrayList;

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
        for (int x = 0; x < arraySize; x ++) {
            for (int y = 0; y < arraySize; y ++) {
                arv[x][y] = x+y;
            }
        }
        return arv;
    }










    // Methods for the homework:

    // Returns the mean of the 2D array mat
    public static double mean(double[][] mat) {
        double summary = 0;
        for (int x = 0; x < mat.length; x ++) {
            for (int y = 0; y < mat.length; y ++) {
                summary += mat[x][y];
            }
        }
        return summary/(mat.length*mat[0].length);
    }

    // Returns the median of the 2D array mat
    // Remember that the array is sorted!
    public static double median(double[][] mat) {
        ArrayList<Double> newtab = new ArrayList<Double>();
        for (int x = 0; x < mat.length; x ++) {
            for (int y = 0; y < mat[0].length; y ++) {
                newtab.add(mat[x][y]);
            }
        }
        if (newtab.size() % 2 == 0) {
            return (newtab.get((int) (newtab.size()/2-0.5)) + newtab.get((int) (newtab.size()/2+0.5))) / 2;
        } else {
            return newtab.get(newtab.size()/2);
        }
    }


    // Returns the mode of the 2D array mat
    // Remember that the array is sorted!
    public static double mode(double[][] mat) {
        int maxnum = 0;
        double num = 0;
        for (int x = 0; x < mat.length; x++) {
            for (int y = 0; y < mat[0].length; y++) {
                int times = 0;
                for (int z = 0; z < mat.length; z++) {
                    for (int w = 0; w < mat[0].length; w++) {
                        if (mat[x][y] == mat[z][w]) {
                            times ++;
                        }
                    }
                }
                if (times > maxnum) {
                    maxnum = times;
                    num = mat[x][y];
                }
            }
        }
        return num;
    }


    public static void main(String[] args) {
        // Write some code here to test your methods!
    }
}
