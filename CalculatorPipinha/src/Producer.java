import java.util.ArrayList;
import java.util.List;

public class Producer {
    public List<String> produce(int n, Generator<String> generator){
        List<String> resultList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            resultList.add(generator.generate());
        }
        return resultList;
    }
}
