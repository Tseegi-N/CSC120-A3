import java.util.*;

class Conversation {

  public static void main(String[] arguments) {
    Scanner input;
    Integer round;
    String reply;
    Scanner user_input;
    List<String> answer = new ArrayList<>();
    
    System.out.println("How many times would you like to repeat this loop?");
    answer.add("How many times would you like to repeat this loop? \n");

    input = new Scanner(System.in);
    round = input.nextInt();
    answer.add(round + "\n");

    System.out.println("Hi there! What's on your mind?");
    answer.add("Hi there! What's on your mind? \n");
    for (int i = 1; i <= round; i++){
      user_input = new Scanner(System.in);
      reply = user_input.nextLine();
      answer.add(reply + "\n");

      if (reply.contains("you")||reply.contains("I")||reply.contains("You")||
      reply.contains("me")||reply.contains("Me")||reply.contains("my")||reply.contains("My")||
      reply.contains("am")||reply.contains("are")||reply.contains("your")||reply.contains("Your")){
        String[] word = reply.split(" ");
        for (int j=0; j<word.length; j++){
          if(word[j].equals("I")){
            word[j] = "You";
          }
          else if(word[j].equals("you")){
            word[j] = "I";
          }
          else if(word[j].equals("You")){
            word[j] = "I";
          }
          else if(word[j].equals("Me")){
            word[j] = "you";
          }
          else if(word[j].equals("me")){
            word[j] = "you";
          }
          else if(word[j].equals("my")){
            word[j] = "your";
          }
          else if(word[j].equals("My")){
            word[j] = "Your";
          }
          else if(word[j].equals("I")){
            word[j] = "You";
          }
          else if(word[j].equals("am")){
            word[j] = "are";
          }
          else if(word[j].equals("are")){
            word[j] = "am";
          }
          else if(word[j].equals("your")){
            word[j] = "my";
          }
          else if(word[j].equals("Your")){
            word[j] = "My";
          }
        }
        System.out.println(String.join(" ", word));
        answer.add(String.join(" ", word) + "\n");
      }
      else{
        System.out.println("Great!");
        answer.add("Great! \n");
      }
    }
    System.out.println("Goodbye");
    answer.add("Goodbye \n");
    System.out.println("\n Final Transcript: \n" + answer);
  }
}
