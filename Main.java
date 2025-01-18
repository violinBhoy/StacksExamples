public class Main {
    public static void main(String args[]) {
        Stack<String> stack = new Stack<>();
        stack.push("A");
        System.out.println(stack.peek());
	stack.push("3");
	stack.pop();
	System.out.println(stack.pop());
    }
}
