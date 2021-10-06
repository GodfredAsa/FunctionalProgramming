package Java4Labs;

import java.util.ArrayList;
import java.util.List;

public class ZipImpl implements Zip{
    @Override
    public List<String> apply(List<String> list1, List<String> list2) {
        List<String> results = new ArrayList<>();


        if (list1.size() == list2.size()){
            for (int i=0; i < list1.size(); i++){
                Pair<String,String> pair = new Pair<>();
                pair.setValue1(list1.get(i));
                pair.setValue2(list2.get(i));
                results.add(pair.getPair());
            }
        }
        return results;
    }
}
