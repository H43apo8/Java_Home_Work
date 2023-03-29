/*Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры могут быть заменены знаком вопроса, например, 2? + ?5 = 69. 
Требуется восстановить выражение до верного равенства. Предложить хотя бы одно решение или сообщить, что его нет. */

public class Task_4 {

    public static void main(String[] args) {
  
      String equation = "2? + ?5 = 69";
  
      solve(equation);
  
    }
  
    
  
    public static void solve(String equation) {
  
      int count = 0;
  
      for (int q = 0; q <= 9; q++) {
  
        for (int w = 0; w <= 9; w++) {
  
          for (int e = 0; e <= 9; e++) {
  
            String exp = equation.replace("?",""+q).replace("?",""+w).replace("?",""+e);
  
            if (checkExpression(exp)) {
  
              count++;
  
              System.out.println(exp);
  
            }
  
          }
  
        }
  
      }
  
      if (count == 0) {
  
        System.out.println("Equation has no solution");
  
      }
  
    }
  
  
  
    public static boolean checkExpression(String expression) {
  
      String[] parts = expression.split("=");
  
      int left = Integer.parseInt(parts[0].trim());
  
      int right = Integer.parseInt(parts[1].trim());
  
      return left + right == 69; //equate to the value of e
  
    }
  
  }