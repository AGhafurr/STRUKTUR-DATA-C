package Latihan12;

public class Stack {
    private int MaxSize;
    private String[] StackArray;
    private int top;

    public Stack(int a){
        MaxSize = 5;
        StackArray = new String[MaxSize];
        top = -1;
    }
    public void push(String j){
        StackArray[++top] = j;
    }
    public String pop(){
        return StackArray[top--];
    }
    public String Peek(){
        return StackArray(top)
    }
    public boolean isEmpty(){
        return (top == -1);
    }
    public boolean isFull(){
        return (top == MaxSize -1);
    }
}
