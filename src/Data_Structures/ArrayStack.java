package Data_Structures;

import java.util.ArrayList;
import java.util.List;

public class ArrayStack {


    List<Character>  arrayStack = new ArrayList<>();
    public ArrayStack() {
        arrayStack = new ArrayList<>();
    }

    public void push(char a)
{

    arrayStack.add(a);
}

   public char pop()
{
    char a =arrayStack.get(arrayStack.size()-1);
    arrayStack.remove(arrayStack.size()-1);
    return a;

}
    public boolean isEmpty() {
        //TODO
        return false;
    }
    public char top() {
        //TODO
        return 'c';
    }
    public void printStack() {
        System.out.println("Stack " + arrayStack);
    }



    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack();
        stack.push('I');
        stack.printStack();
        System.out.println( stack.pop() );
        stack.printStack();
    }}
