import java.util.Arrays;

public class FrontDoor {
    public static void main(String[] args) {
        int[] heights = new int[3];
        heights[0] = 78;
        heights[1] = 72;
        heights[2] = 69;
        System.out.println(Arrays.toString(heights));

        String[] alphabeticalNames = {"Abby", "David", "Charlie", "Lauren"};
        String temp = alphabeticalNames[2];
        alphabeticalNames[2] = alphabeticalNames[1];
        alphabeticalNames[1] = temp;
        for (int i = 0; i < 4; i++) {
            System.out.println(alphabeticalNames[i]);
        }

        double[] array1 = {7.5, 10.0};
        double[] array2 = {8.2, 14.8};
        double[] array3 = {array1[0] + array2[0], array1[1] * array2[1]};
        System.out.println(Arrays.toString(array3));
    }
}
