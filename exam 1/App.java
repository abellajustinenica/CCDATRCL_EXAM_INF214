import java.util.LinkedList;
import java.util.Stack;

public class App {
    public static void main(String[] args) throws Exception {

        // ARRAYS
        // ======================================================
        // 1. Create an array of characters of your SURNAME
        char[] abella = { 'A', 'B', 'E', 'L', 'L', 'A'};

        // 2. Display each character of your SURNAME on each line.
        for (int i = 0; i < abella.length; i++) {
        System.out.println(abella[i]);
        }

        // 3. Display the first character of your SURNAME
        System.out.println(abella[0]);

        // 4. Display the last character of your SURNAME
        System.out.println(abella[5]);

        // 5. Display the character of your SURNAME in reverse order
        for (int i = abella.length - 1; i >= 0; i--) {
        System.out.println(abella[i]);
        }

        // Linked List
        // ======================================================
        // 1. Create a Linked list of the last six numbers of your STUDENT NUMBER
        LinkedList<String> studentNumber = new LinkedList<>();

        studentNumber.add("1");
        studentNumber.add("o");
        studentNumber.add("6");
        studentNumber.add("1");
        studentNumber.add("9");
        studentNumber.add("1");

        System.out.println(studentNumber);

        //  Add an asterisk (*) to the head/front of the Linked list
        studentNumber.addFirst("*");

        System.out.println(studentNumber);

        // 3. Add an asterisk (*) to the tail/end of the Linked list
        studentNumber.addLast("*");

        System.out.println(studentNumber);

        // 4. Display the Linked list
        System.out.println(studentNumber);

        // 5. Display the last character of the Linked list
        System.out.println(studentNumber.get(7));

        // 6. Replace the last character of the Linked list with the exclamation symbol (!);
        studentNumber.set(7,"!");

        // 7. Remove the first character of the Linked list
        System.out.println(studentNumber.remove(0));

        // 8. Display the LinkedList
        System.out.println(studentNumber);
    
        // Stack
        // ======================================================
        // 1. Create a Stack of characters of your SURNAME

        Stack<String> surname = new Stack<>();

        surname.push("A");
        surname.push("B");
        surname.push("E");
        surname.push("L");
        surname.push("L");
        surname.push("A");

        // 2. Print the Stack
       System.out.println(surname);

        // 3. Add a "INF214" to the stack
        surname.push(" ");
        surname.push("I");
        surname.push("N");
        surname.push("F");
        surname.push("2");
        surname.push("1");
        surname.push("4");

        // 4. Print the Stack
       System.out.println(surname);

        // 5. Remove "INF214" and add "CCDATRCL-INF214"
        surname.pop();
        surname.pop();
        surname.pop();
        surname.pop();
        surname.pop();
        surname.pop();

        surname.push("C");
        surname.push("C");
        surname.push("D");
        surname.push("A");
        surname.push("T");
        surname.push("R");
        surname.push("C");
        surname.push("L");
        surname.push("-");
        surname.push("I");
        surname.push("N");
        surname.push("F");
        surname.push("2");
        surname.push("1");
        surname.push("4");
    
        // 6. Print the Stack
    System.out.println(surname);
    }
}
