import java.util.EmptyStackException;

public class Stack{

    private int A[];
    private int index;

    public void stack_init(){
        index = -1;
        A = new int[10];
    }

    public boolean empty(){
        return index == -1;
    }

    public void push(Integer val) throws Exception {

        if(index < A.length){
            index++;
            A[index] = val;
        }else{
            throw new Exception("Error - Stack is full.");
        }
    }

    public Integer pop(){
        if(!empty()){
            int popped = A[index];
            index--;
            return popped;
        }else{
            throw new EmptyStackException();
        }
    }

    public Integer top(){
        if(!empty()){
            return A[index];
        }else{
            throw new EmptyStackException();
        }
    }
}