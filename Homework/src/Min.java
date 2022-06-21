public class Min {
    public static void main(String[] args) {
        double [] nums = {4, 2.4, 89, 34.1, 943.9};
        double min = Double.MAX_VALUE;

        for(int i = 0; i < nums.length; i++){
            min = Math.min(min, nums[i]);
        }
        System.out.println("Минимальный элемент: " + min);
    }
}
