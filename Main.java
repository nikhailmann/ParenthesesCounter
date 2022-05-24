import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    
    Stack parenthesesCounter = new Stack();
    Scanner scan;
    System.out.println("Input Line of Text: ");
    scan = new Scanner(System.in);
    char open = '(';
    char closed = ')';
    int breakchecker = 0;

    String input = scan.nextLine();
    for (int i = 0; i < input.length(); i++) {
      char currentChar = input.charAt(i);
       if (currentChar == open) {
         parenthesesCounter.push(0);
       } 
       else if (currentChar == closed){
         if (parenthesesCounter.pop() == null) {
           System.out.println("Too many )");
           breakchecker = 1;
           break;
         } 
       }
    }
    if (parenthesesCounter.pop() != null) {
      System.out.println("Too many (");
    }
    else if(breakchecker != 1) {
      System.out.println("Parentheses match perfectly!");
    }
  }
}