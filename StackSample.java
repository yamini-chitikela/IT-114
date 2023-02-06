import java.util.Stack;

public class StackSample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        for(int i = 0; i < 10; i++){
            stack.push(i);
        }
        System.out.println("Stack: " + stack.toString());

        Integer i;
        while((i = stack.pop()) != null){
            System.out.println("Retrieved " + i);
        }
        System.out.println("Stack is empty");
    }
<<<<<<< HEAD
} 
    

=======
}
>>>>>>> 2884e01cd6b3f1a4603ba4bfa8cf7cd39077afb9
