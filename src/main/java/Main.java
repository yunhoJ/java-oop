import logic.BubbleSort;

import java.util.Arrays;

public class Main {
    public static void Main(String[] args) {
        BubbleSort<String>sort= new BubbleSort<String>();
        System.out.println("result : "+sort.sort(Arrays.asList(args)));
    }
}
