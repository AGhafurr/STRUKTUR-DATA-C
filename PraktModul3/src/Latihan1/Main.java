package Latihan1;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack st = new Stack<>();

        st.push("Aku");
        st.push("Anak");
        st.push("Indonesia");

        System.out.println("Next : " + st.peek());
        st.push("Raya");
        System.out.println(st.pop());
        st.push("!");

        int Count = st.search("Aku");
        while (Count != -1 && Count > 1){
            st.pop();
            Count--;
        }
        System.out.println(st.pop());
        System.out.println(st.empty());

    }
}