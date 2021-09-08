package Task07;

public class MyIntStack {

    private final int[] data;
    private int top = -1;

    public MyIntStack(int size) {
        data = new int[size];
    }

    public void push(int value) {

        if (isFull()) {
            System.arraycopy(data, 1, data, 0, data.length - 1);
            data[top] = value;
        } else {
            data[++top] = value;
        }
    }

    public int peek() {
         return data[top];
    }

    public Boolean isFull() {
        return top == data.length - 1;
    }
}
