public class Calculator {
    public int executeOperation(int x, int y, Operation operation) {
        return operation.calculate(x, y);
    }

}
