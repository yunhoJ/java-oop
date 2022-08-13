import com.config.Config;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.service.SortService;

import java.util.Arrays;

public class Main {
    //의존성 주입
    //필드에 주입할거 생성

    public static void Main(String[] args) {
        ApplicationContext context =new AnnotationConfigApplicationContext(Config.class);
//        Sort<String> sort= context.getBean(Sort.class);//빈을 꺼내 오기
        SortService sortService=context.getBean(SortService.class);
//        Sort<String> sort = new javaSort<>();
//        Sort<String> sort= new BubbleSort<String>();
        System.out.println("result sortservice"+sortService.doSort(Arrays.asList(args)));
//        System.out.println("result : "+sort.sort(Arrays.asList(args)));
    }
}
