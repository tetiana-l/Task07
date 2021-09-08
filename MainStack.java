package Task07;

public class MainStack {

    public static void main(String[] args) {

        MyIntStack stack = new MyIntStack(3);

        stack.push(7);
        stack.push(67);
        stack.push(4);
        stack.push(5);
        stack.push(50);
        stack.push(44);

        System.out.println(stack.peek());

    }
}
