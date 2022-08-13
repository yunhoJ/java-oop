package logic;

import com.logic.BubbleSort;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {
    @DisplayName("버블소트 - 리스트 넣으면 정렬된 결과를 출력")
    @Test
    void givenList(){
//        given
        BubbleSort<Integer> bubbleSort =new BubbleSort<Integer>();
//        when
        List<Integer>actual =bubbleSort.sort(List.of(3,2,1,5,10,80,4));

//        then
        assertEquals(List.of(1,2,3,4,5,10,80),actual);


    }

}