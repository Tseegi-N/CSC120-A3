import java.util.*;

class Conversation {
  /* Simple conversation bot that returns mirror words for keywords;  
   * If no keyword appears, it returns simple dialogue.
   */
  public static void main(String[] arguments) {
    /* scanner variables to recieve input
     * round = number of inputs 
     * reply = input/ referenced for edits to keywords
     * answer = list to save transcript
     * response = array of possible canned response when there's no keyword
     * response_n = randome number to get random string from list
     */
    Scanner input;
    Integer round;
    String reply;
    Scanner user_input;
    List<String> answer = new ArrayList<>();
    Random respone_n = new Random();
    String[] response = new String[]{"Great!", "Really?", "Cool", "Interesting", "Cool beans", "haahhah"};
    
    System.out.println("How many times would you like to repeat this loop?");
    answer.add("How many times would you like to repeat this loop? \n");

    input = new Scanner(System.in);
    round = input.nextInt();
    answer.add(round + "\n");

    System.out.println("Hi there! What's on your mind?");
    answer.add("Hi there! What's on your mind? \n");

    //Run the conversation according to the round number; keep it in a loop to check keywords
    for (int i = 1; i <= round; i++){
      user_input = new Scanner(System.in);
      reply = user_input.nextLine();
      answer.add(reply + "\n");

      //If any keywords appear in the input, seperate it into list and change keywords with mirror words
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
        //Join lists into a string
        System.out.println(String.join(" ", word));
        answer.add(String.join(" ", word) + "\n");
      }

      //No keyword: reply with canned response from array list
      else{
        int random_response = respone_n.nextInt(5);
        System.out.println(response[random_response]);
        answer.add(response[random_response] + "\n");
      }
    }
    //End conversation
    System.out.println("Goodbye");

    //Change list to string and print out transcript
    answer.add("Goodbye \n");
    answer.toString();
    System.out.println("\n Final Transcript: \n" + String.join("", answer));
  }
}
