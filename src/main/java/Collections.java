import java.util.LinkedList;
public class Collections {
    static int printMax(int subArraySize){
        LinkedList<Integer> queue = new LinkedList<>();
        queue.add(3);
        queue.add(2);
        queue.add(7);
        queue.add(5);
        queue.add(7);
        queue.add(7);
        queue.add(8);
        queue.add(8);
        int highUniqueNums =0;
        String checkedNumbers = "";
        for (int a = 0; a<queue.size(); a++) {
            LinkedList<Integer> subArray = new LinkedList<>();
            if (a+subArraySize-1 == queue.size()) { break; }
            for (int b = 0; b < subArraySize; b++){
                subArray.add(queue.get(a + b));
            }
//            for (int value: subArray){
//                if(){
//
//                }
//            }
            System.out.println(subArray);
        }
        return highUniqueNums;
    }
}