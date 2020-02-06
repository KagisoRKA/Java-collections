import java.util.LinkedList;
public class Main {
    public static void main(String[] args) {
        int subArraySize = 3;
        LinkedList<Integer> queue = new LinkedList<>();
        queue.add(7);
        queue.add(5);
        queue.add(5);
        queue.add(7);
        System.out.println(Collections.printMax(subArraySize, queue));
    }
}