import java.util.EmptyStackException;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.*;

public class DSDriver{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        if (input.equals("stack")) {
            stack();
        } else if (input.equals("queue")) {
            queue();
        }else{
            System.out.println("Not a valid input");
        }

    }

    static void queue(){
        Queue q = new Queue();
        q.queue_init();
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                int inVal = sc.nextInt();

                if (inVal <= -1) {
                    System.out.println("Front: " + q.front());
                } else if (inVal == 0) {
                    System.out.println("Dequeue: " + q.dequeue());
                } else {
                    q.enqueue(inVal);
                }

            }catch(InputMismatchException i) {
                System.out.println("You done messed quited!");
                break;
            }catch(EmptyStackException e){
                System.out.println("Error - Queue is empty");
            }catch(Exception f){
                System.out.println(f.getMessage());
            }
        }
    }

    static void stack(){
        Stack stack = new Stack();
        stack.stack_init();
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                int inVal = sc.nextInt();

                if (inVal <= -1) {
                    System.out.println("Top: " + stack.top());
                } else if (inVal == 0) {
                    System.out.println("Pop: " + stack.pop());
                } else {
                    stack.push(inVal);
                }

            }catch(InputMismatchException i){
                System.out.println("You done messed quited!");
                break;
            }catch(EmptyStackException e){
                System.out.println("Error - Stack is empty");
            }catch(Exception f){
                System.out.println(f.getMessage());
            }
        }
    }
}