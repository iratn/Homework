import java.sql.SQLOutput;

public class Decrease {
    public static void main(String[] args) {

        int nums[]= {10, 30, 50, 70, 90, 120};
        int proc[] = {25};

        for ( int i = 0; i < nums.length; i++){
            for(int x = 0; x < proc.length; x++){
                int result = nums[i] / proc[x];
                System.out.println(result);
            }
        }

    }
}
