package Bubble;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        int []numbers= { 5,3,9,4,1,2,8,6};

        BubleStart sorter= new BubleStart();

        System.out.println(Arrays.toString(numbers));
        sorter.sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}
