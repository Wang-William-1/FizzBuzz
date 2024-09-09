public class Multiples {
    public static void main(String[] args) {

        int count = 0;

        for (int i = 1; i < 1000; i++) {

            Boolean divisibleBy3 = i % 3 == 0;
            Boolean divisibleBy5 = i % 5 == 0;

            if (divisibleBy3 || divisibleBy5) {
                count++;
            }
        }
        System.out.println(count + " non-negative multiples of 3 or 5 below 1000");
    }
}
