public class App {
    public static void main(String[] args) {
        System.out.println("Stack with linked list...");

        Stack<Integer> intStack = new Stack<>();

        intStack.push(10);
        intStack.push(100);
        intStack.push(1000);

        System.out.println(intStack.size());

        System.out.println(intStack.pop());
        System.out.println(intStack.pop());
        System.out.println(intStack.pop());


        Stack<String> strStack = new Stack<>();

        strStack.push("A");
        strStack.push("B");
        strStack.push("C");

        System.out.println(strStack.size());

        System.out.println(strStack.peek());

        System.out.println(strStack.pop());
        System.out.println(strStack.pop());
        System.out.println(strStack.pop());
    }
}