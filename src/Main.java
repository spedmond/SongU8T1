import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[][] seatingChart = { {"Abby", "Don", "George", "Kim"},
                                    {"Brian", "Elenor", "Harry", "Lenny"},
                                    {"Cathy", "Fred", "Jill", "Matt"}
        };

        seatingChart[1][2]="Paul";

        String temp = seatingChart[2][3];
        seatingChart[2][3] = seatingChart[0][0];
        seatingChart[0][0] = temp;

        for (String[] row : seatingChart) {
            System.out.println(Arrays.toString(row));
        }

        System.out.println(seatingChart[0][2] + seatingChart[2][0]);

        int[][] arr1 = new int[2][3];
        int[][] arr2 = new int[3][2];

        for (int i = 1; i <= 3; i++) {
            arr1[0][i-1] = i;
        }
        for (int i = 1; i <= 3; i++) {
            arr1[1][i-1] = i+3;
        }
        for (int[] row : arr1) {
            System.out.println(Arrays.toString(row));
        }



        for (int i = 1; i <= 2; i++) {
            arr2[0][i-1] = i;
        }
        for (int i = 1; i <= 2; i++) {
            arr2[1][i-1] = i+2;
        }
        for (int i = 1; i <= 2; i++) {
            arr2[2][i-1] = i+4;
        }
        for (int[] row : arr2) {
            System.out.println(Arrays.toString(row));
        }
    }
}
