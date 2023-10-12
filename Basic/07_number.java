public class number {
    static void bintodec(int n) {
        int pow = 0;
        int decimal = 0;
        while (n > 0) {
            int last = n % 10;
            decimal = decimal + (last * (int) Math.pow(2, pow));
            pow++;
            n = n / 10;
        }
        System.out.println(decimal);

    }

    static void dectobin(int n) {
        int pow = 0;
        int binary = 0;
        while (n > 0) {
            int last = n % 10;
            binary = binary + (last * (int) Math.pow(10, pow));
            pow++;
            n = n / 10;
        }
        System.out.println(binary);
    }


    public static void main(String[] args) {

        // Binary to Decimal
        int a = 101;
        bintodec(a);
        dectobin(a);

    }
}