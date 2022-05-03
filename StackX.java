class StackX{
private final int SIZE = 20;
private int[] st;
private int top;

public StackX(){
//constructor
st = new int[SIZE]; // make array
top = -1;
}
public void push(int j)// put item on stack
{ 
    st[++top] =j;
}
public int pop()
{ return st[top--];}
//take item off stack
public int peek()
{ return st[top];
}

//peek at top of stack
public boolean isEmpty()  //true if nothing on stack
{ return (top ==-1); 
}
}
// end class StackX

