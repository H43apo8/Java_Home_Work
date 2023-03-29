// Вам дается строка S и целочисленный массив индексов int index[s.length].
// Напишите программу, которая перетасует символы в S таким образом,
// что символ c i-й позиции переместится на индекс index[i] в результирующей строке.
//
// Пример: s = “cba”, index = [3,2,1] result “abc”

public class Task_1 {
    public static void main(String[] args) {
        String s = "cba";
        int[] index = {3, 2, 1};
        String result = restoreString(s, index);
        System.out.println(result);
    }

    public static String restoreString(String s, int[] index) {
        char[] shuffled = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            shuffled[index[i]] = s.charAt(i);
        }
        return new String(shuffled);
    }

}
