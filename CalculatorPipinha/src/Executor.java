import java.util.ArrayList;
import java.util.List;

public class Executor {
    public List<String> executeAction(List<String> strings, Action action) {
        for (String string : strings) {
            action.execute(string);
        }
        return strings;
    }
}