package gamePackage;
import  java.util.Stack;
public class StackClass {

    public static void main(String[] args) {

        Stack stack = new Stack();

        stack.push("jeff");
        stack.push("daljeet");
        stack.push("winsen");

        stack.remove(0);
        stack.add("janet");

        System.out.println(stack);

        System.out.println(stack.peek());// to show you the one on the peek


    }
}
