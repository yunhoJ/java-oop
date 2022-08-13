import logic.BubbleSort;
import logic.Sort;
import logic.javaSort;

import java.util.Arrays;

public class Main {
    //의존성 주입
    //필드에 주입할거 생성

    public static void Main(String[] args) {
        Sort<String> sort = new javaSort<>();
//        Sort<String> sort= new BubbleSort<String>();
        System.out.println("result : "+sort.sort(Arrays.asList(args)));
    }
}
