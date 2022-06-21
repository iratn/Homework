import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Longest {
    public static void main(String[] args) {
        String [] word = {"Presented","the moment", "in", "with", "message", "allocated"};
int max = 0;
        for(int i = 0; i <word.length; i++){
            if(word[i].length()> word[max].length()){
                max = i;
            }

        }
        System.out.println(word[max]);


    }
}

