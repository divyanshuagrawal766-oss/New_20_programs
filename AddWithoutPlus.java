public class AddWithoutPlus {
     public static int add(int a, int b) {
        while (b != 0) {
            int carry = a & b;
            a = a ^ b;
            b = carry << 1;
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(add(5, 7));    // 12
        System.out.println(add(-3, 10));  // 7
    }
}
