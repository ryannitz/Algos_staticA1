import java.util.EmptyStackException;
import java.util.Scanner;

public class CheckBrackets {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String bracketSequence = sc.next();

        Stack stack = new Stack();
        stack.stack_init();

        boolean popError = false;

        for(int i = 0; i < bracketSequence.length(); i ++){
            char curBracket = bracketSequence.charAt(i);
            try {
                if (curBracket == '(') {
                    stack.push(1);//using ints to reuse stack
                } else if (curBracket == ')') {
                    try {
                        stack.pop();
                    } catch (EmptyStackException e) {
                        popError = true;
                        break;
                    }
                }
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        }

        if(stack.empty() && !popError){
            System.out.println("Brackets were matching");
        }else{
            System.out.println("Bracket were not matching");
        }
    }
}
