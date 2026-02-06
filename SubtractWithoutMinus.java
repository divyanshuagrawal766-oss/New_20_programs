public class SubtractWithoutMinus {
     public static int subtract(int a, int b) {
        // a - b = a + (b + 1)
        return AddWithoutPlus.add(a, AddWithoutPlus.add(b, 1));
    }

    public static void main(String[] args) {
        System.out.println(subtract(15, 5));   // 10
        System.out.println(subtract(10, 20));  // -10
    }
}
