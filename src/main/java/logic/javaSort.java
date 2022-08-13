package logic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class javaSort <T extends Comparable<T>>implements Sort<T> {

    @Override
    public List<T> sort(List<T> list){
        List<T> output =new ArrayList<T>(list);
        Collections.sort(output);
        return output;
    }
}
