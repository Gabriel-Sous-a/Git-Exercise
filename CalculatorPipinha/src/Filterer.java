import java.util.ArrayList;
import java.util.List;

public class Filterer {
    public List<String> filtered(List<String> initialList, Filter filter) {
        List<String> filtered = new ArrayList<>();
        for (String s : initialList) {
            if(filter.accept(s)){
                filtered.add(s);
            }
        }
        return filtered;
    }
}
