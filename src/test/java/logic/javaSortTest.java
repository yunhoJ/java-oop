package logic;

import com.logic.javaSort;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class javaSortTest {

    @DisplayName("자바소트 - 리스트 넣으면 정렬된 결과를 출력")
    @Test
    void givenList(){
//        given
        javaSort<Integer> javaSort =new javaSort<Integer>();
//        when
        List<Integer> actual =javaSort.sort(List.of(3,2,1,5,10,80,4));

//        then
        assertEquals(List.of(1,2,3,4,5,10,80),actual);


    }
}