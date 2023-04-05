//Task_3
// Дан Deque состоящий из последовательности цифр.
// Необходимо проверить, что последовательность цифр является палиндромом
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Task_3 {

    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>(Arrays.asList(1,2,3,4,5,6));
        System.out.println(checkOn(deque));
    }

    public static boolean checkOn(Deque<Integer> deque){
        while(deque.size() > 1){
            int first = deque.pollFirst();
            int last = deque.pollLast();
            if(first != last){
                return false;
            }
        }
        return true;
    }
}