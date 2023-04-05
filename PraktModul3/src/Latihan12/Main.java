package Latihan12;

public class Main {
    public static void main(String[] args) {
        Stack theStack = new Stack(10);
        theStack.push("Aku");
        theStack.push("Anak");
        theStack.push("Indonesia");

        System.out.println("Next : " + theStack.Peek());

        while (!theStack.isEmpty()){
            String Value = theStack.pop();
            System.out.println(Value);
            System.out.println(" ");
        }
        System.out.println("");
    }

}