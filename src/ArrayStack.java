
public class ArrayStack implements StackADT {

    private Object[] objects;
    private Integer top;

    public ArrayStack(Integer stackSize) {
        this.objects = new Object[stackSize];
//        this.top = this.objects.length;
        this.top = -1;
    }

    public String toString() {
        /* algorithm
            set up a string to contain the stack details
            if stack is not empty then
                for each slot from the top to the end of the array loop
                    add the current slot object to the string
                end loop
            else
                add empty stack message to the string
            end if
         */
        String stackDetails = new String();
        // add code here
        if (this.objects.length != 0) {
            for (int i = 0; i <= this.top; i++) {
                stackDetails = stackDetails + this.objects[i].toString() + "\n";
            }
        } else {
            stackDetails = ("Empty stack");
        }

        return stackDetails;
    }

    public void push(Object object) {
        /* algorithm
            if stack is full then
               throw array full exception 
            end if
            move top to the next available slot
            copy object to the top slot
         */
        // add code here
        if (this.top == this.objects.length - 1) {
            throw new ArrayIndexOutOfBoundsException();
        }
        this.top++;
        this.objects[top] = object;
    }

    public Object pop() throws StackEmptyException {
        /* algorithm
            if stack is empty then
                throw stack empty exception
            end if
            save the object at the top slot
            delete the object at the top slot
            move top to the next slot
         */
        // add code here
        if (this.top == -1) {
            throw new StackEmptyException();
        }
        Object result = this.objects[top];
        this.objects[top] = null;
        this.top--;
        return result;
    }

}
