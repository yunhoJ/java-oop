package service;

import logic.javaSort;
import logic.Sort;

import java.util.List;

public class SortService {
    //의존성 주입
    //필드에 주입할거 생성
    private final Sort<String> sort;

    public SortService(Sort<String> sort) {
        this.sort = sort;
        System.out.println("구현체 : "+sort.getClass().getName());
    }

    public List<String> doSort(List<String>list){
//        Sort<String> sort= new javaSort<String>();
        return sort.sort(list);
    }
}
