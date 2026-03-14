public class BinaryPattern {
    public static void main(String[] args) {
        int rows = 6;

        for (int i = 1; i <= rows; i++) {
            int val = (i % 2 == 0) ? 0 : 1;

            for (int j = 1; j <= i; j++) {
                System.out.print(val);
                val = 1 - val; 
            }
            System.out.println();
        }
    }
}