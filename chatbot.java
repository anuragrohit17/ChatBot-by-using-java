// chatbot using java
import java.util.Scanner;
    public class Apnamitra{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Apnamitra: Hello! How can I assist you today?");
            while (true) {
                String userInput = scanner.nextLine();
                if (userInput.equalsIgnoreCase("Hello")) {
                    System.out.println("Apnamitra: Hi, Hello sir!");
                } else if (userInput.equalsIgnoreCase("how are you")) {
                    System.out.println("Apnamitra: I'm good,thank you,and you");
                } else if (userInput.equalsIgnoreCase("i am fine also")) {
                    System.out.println("Apnamitra: Tell me Your querry");
                } else if (userInput.equalsIgnoreCase("yes ")) {
                    System.out.println("Apnamitra: Tell me about your querry");
                } else if (userInput.equalsIgnoreCase("issue with online correction"))//any reason no matter
                    {
                    System.out.println("Apnamitra: Tell me which type of problem are you faced?");
                } else if (userInput.equalsIgnoreCase("yes")) {
                    System.out.println("Apnamitra: Tell me issue like Profile change" +
                            "some data add"+"delete account");//note use switch case here for multiple problem
                } else if (userInput.equalsIgnoreCase("delete account")) {
                    System.out.println("Apnamitra: please sir fill account closure form the process automatic process");
                }else if (userInput.equalsIgnoreCase("Thanking You ")) {
                    System.out.println("Apnamitra: Welcome Sir Nice to chat with U and try to connect next day");
                    break;
                } else {
                    System.out.println("Apnamitra: Sorry, I didn't understand that.");
                }
            }
            scanner.close();
        }
    }
