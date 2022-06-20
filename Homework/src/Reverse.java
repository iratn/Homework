public class Reverse {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5, 6 };
        int length = 0;
        for (int element : a)
        {
            length++;
        }
        for (int i = length - 1; i >= 0; i--)
        {
            System.out.println(a[i]);
        }
    }
}
