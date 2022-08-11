package logic;

import java.util.List;

public interface sort <T extends Comparable<T>>{
    List<T> sort(List<T> list);
}
