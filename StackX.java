class StackX {
    private final int SIZE = 700;
    private int[] size_t;
    private int head;

    public StackX() {
        // constructor
        size_t = new int[SIZE]; // make array
        head = -1;
    }

    public void push(int j)// put item on stack
    {
        size_t[++head] = j;
    }

    public int pop() {
        return size_t[head--];
    }

    // take item off stack
    public int peek() {
        return size_t[head];
    }

    // peek at top of stack
    public boolean isEmpty() // true if nothing on stack
    {
        return (head == -1);
    }
}
// end class StackX
