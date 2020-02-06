import java.util.LinkedList;
public class Collections {
    static int printMax(int subArraySize, LinkedList<Integer> queue){
        int maxUniqueNums =0;
        //queue iteration
        if(subArraySize ==0){
            return 0;
        }
        for (int a = 0; a<queue.size(); a++) {
            LinkedList<Integer> subArray = new LinkedList<>();
            //if subArrays are exhausted, the program should break
            if (a+subArraySize-1 == queue.size()) { break; }
            //creation of subArray
            for (int b = 0; b < subArraySize; b++){
                subArray.add(queue.get(a + b));
            }
            int uniqueNums = 1;
            //store checked numbers
            StringBuilder checkedNumbers = new StringBuilder();
            //iteration into subArray
                for (Integer val : subArray) {
                    if (!subArray.get(0).equals(val) && !checkedNumbers.toString().contains(val.toString())) {
                        checkedNumbers.append(val.toString());
                        uniqueNums += 1;
                    }
                }
            System.out.println(subArray +" "+ uniqueNums);
            if(uniqueNums>maxUniqueNums){
                maxUniqueNums = uniqueNums;
            }
        }
        return maxUniqueNums;
    }
}