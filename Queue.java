import java.util.EmptyStackException;

public class Queue{

    public int[] Q;
    public int f;
    public int r;

    public void queue_init(){
        Q = new int[10];
        r = -1;
        f = -1;
    }

    public boolean empty(){
        return r == -1;
    }

    public void enqueue(Integer val) throws Exception {
        if(empty()){
            r = 0;
            f = 0;
        }else{
            r++;
            if(Q.length == r){
                r = 0;
            }
            if(r==f){
                throw new Exception("Error - Queue is full.");
            }
        }
        Q[r] = val;
    }

    public int dequeue() {
        if (empty()) {
            throw new EmptyStackException();
        } else {
            int ret = Q[f];
            if (r == f) {
                r = -1;
                f = -1;
            } else {
                f++;
                if (f == Q.length) {
                    f = 0;
                }
            }
            return ret;
        }
    }

    public int front(){
        if(empty()){
            throw new EmptyStackException();
        }else{
            return Q[f];
        }
    }
}