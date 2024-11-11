import java.util.Scanner;

public class Calculator{
    public static void main(String[] args){

		    Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your expression (operators included AND space out each term): ");

        String expression = scanner.nextLine();

        String[] operatorString = expression.split(" ");


        int result = Integer.parseInt(operatorString[0]);
        for(int i = 0; i < operatorString.length; i++){

          if(operatorString[i].equals("+")){
            result += Integer.parseInt(operatorString[i + 1]);
          }
          if(operatorString[i].equals("-")){
            result -= Integer.parseInt(operatorString[i + 1]);
          }
          if(operatorString[i].equals("*")){
            result *= Integer.parseInt(operatorString[i + 1]);
          }
          if(operatorString[i].equals("/")){
            result /= Integer.parseInt(operatorString[i + 1]);
          }
            

        }
        System.out.println(result);




	}
}


