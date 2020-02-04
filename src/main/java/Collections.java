import java.util.LinkedList;
public class Collections {
    static int printMax(int subArraySize){
        LinkedList<Integer> queue = new LinkedList<>();
        queue.add(3);
        queue.add(2);
        queue.add(2);
        queue.add(2);
        queue.add(2);
        queue.add(2);
        int highUniqueNums =0;
        LinkedList<Integer> checkedValues = new LinkedList<>();
        for (int a=0; a<queue.size();a++){
            int uniqueNum = 0;
            for(int b=1; b<=subArraySize-1;b++){
                if(!queue.get(a).equals(queue.get(a+b))){
                    uniqueNum+=1;
                }
            }
            if(uniqueNum > highUniqueNums){
                highUniqueNums=uniqueNum;
            }
            if(queue.get(a).equals(queue.get(queue.size()-subArraySize))){
                break;
            }
        }
        return highUniqueNums;
    }
}