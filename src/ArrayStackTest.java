
public class ArrayStackTest {

    public static void main(String[] args) {
        Integer stackSize=Input.getInteger("stack size: ");
        StackADT stack = new ArrayStack(stackSize);
        Integer value;
        Integer option;
        do {
            System.out.println("0: quit");
            System.out.println("1: push");
            System.out.println("2: pop");
            System.out.println("3: display");
            option = Input.getInteger("option: ");
            switch (option) {
                case 0:
                    System.out.println("quitting program");
                    break;
                case 1:
                    value=Input.getInteger("value: ");
                    try{
                        stack.push(value);
                        System.out.println("pushed");
                    }
                    catch(ArrayIndexOutOfBoundsException e){
                        System.out.println("push invalid - stack is full");
                    }
                   break;
                case 2:
                    try{
                        value=(Integer)stack.pop();
                        System.out.println(value+" popped");
                    }
                    catch(StackADT.StackEmptyException e){
                        System.out.println("pop invalid - stack is empty");
                    }
                    break;
               case 3:
                    System.out.println(stack);
                    break;
                default:
                    System.out.println("invalid option");
            }
        } while (option != 0);
    }
}
