public class NumberDigits {

    public static void main(String[] args) {

        int count = 0, num = 5112;

        while(num != 0)
        {
            num /= 10;
            ++count;
        }

        System.out.println("Number of digits: " + count);
    }
}