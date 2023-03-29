// Посчитайте сколько драгоценных камней в куче обычных камней
// Пример:
// jewels = “aB”, stones = “aaaAbbbB”
// Результат в консоль ”a3B1”


public class Task_0 {
    public static void main(String[] args) {
        String jewels = "aB";                               //Переменные jewels и stones содержат соответственно строки с символами драгоценных камней и обычных камней.
        String stones = "aaAbbbB";

        int count = 0;
        for (int i = 0; i < stones.length(); i++) {                         //в цикле происходит перебор каждого символа в строке stones.
            if (jewels.contains(Character.toString(stones.charAt(i)))) {    //Если символ является драгоценным камнем, то переменная count увеличивается на 1
                count++;
            }
        }

        System.out.println(jewels.charAt(0) + "" + count + jewels.charAt(1) + "1");
    }   //результат в виде строки, состоящей из первого символа драгоценного камня, количества найденных драгоценных камней и второго символа драгоценного камня и числа 1. 
}