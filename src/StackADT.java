
public abstract interface StackADT {
    public class StackEmptyException extends Exception{}

    public abstract void push(Object object);

    public abstract Object pop() throws StackEmptyException;
}
