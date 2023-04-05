//Task_4
//Даны два Deque представляющие два неотрицательных целых числа. Цифры хранятся в обратном порядке,
// и каждый из их узлов содержит одну цифру.
// Сложите два числа и верните сумму в виде связанного списка.

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
public class Task_4 {

    public static void main(String[] args) {
        Deque<Integer> d1 = new ArrayDeque<>(Arrays.asList(1,2,3));
        Deque<Integer> d2 = new ArrayDeque<>(Arrays.asList(5,4,7));
        
        Task_4 task = new Task_4();
        Deque<Integer> result = task.sum(d1, d2);
        System.out.println(result);

    }

    public Deque<Integer> sum(Deque<Integer> d1, Deque<Integer> d2) {
        Deque<Integer> result = new ArrayDeque<>();
        int carry = 0;

        while(!d1.isEmpty() || !d2.isEmpty() || carry != 0){
            int sum = carry;
            if(!d1.isEmpty()){
                sum += d1.pollLast();
            }
            if(!d2.isEmpty()){
                sum += d2.pollLast();
            }
            result.addFirst(sum%10);
            carry = sum/10;
        }

        return result;
    }
}