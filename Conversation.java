import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random ;



// Where code for chatbot conversation starts
class Conversation {

  /**
   * @param arguments
   */
  public static void main(String[] arguments) {
    

  //Canned responses

    final String [] botDialogue = {"Could you tell me more?", "Hmm", "Wow!", "Interesting...", "Sounds fascinating"};



  //Creating scanner

    Scanner input = new Scanner(System.in);
    Random random = new Random();


  //Rounds message

    System.out.println("Before we start, how many conversational rounds would you like to have? (enter a number)");
    Integer rounds = input.nextInt();//saves the number provided in a variable labeled 'rounds'
      input.nextLine(); //clears the input buffer

    ArrayList <String> transcript = new ArrayList <String>(); //creates transcript array

    int roundsDone = 0; //starts completed rounds at 0

  //Begining of conversation

    System.out.println ("Welcome to Katie's Chatbot. What's on your mind?"); //welcome messsage
    transcript.add("Welcome to Katie's Chatbot. What's up?"); //adds message to transcript

    while (roundsDone != rounds){
        
        //how computer responds w/ no mirror words;
          int randNum = random.nextInt(botDialogue.length);// creates a random number that's within the bounds of the length of 'botDialogue's string 
          String response = input.nextLine(); //takes what user said and makes it into a variable "response"
          transcript.add(response); //adds "response" from user to transcript

          System.out.println(botDialogue[randNum]);// bot responds with one of five responses dependng on what random number is generated
          transcript.add(botDialogue[randNum]);// adds bot's response to transcript
          
          roundsDone++; 

    if (roundsDone == rounds){

    // input.nextLine(); //user's final response
    
    System.out.println("We have completed " +rounds+ " of conversation together. Time to say goodbye for now!");//goodbye message
    transcript.add("We have completed " +rounds+ " of conversation together. Time to say goodbye for now!");// adds goodbye message to transcript
      
    System.out.println("Transcript:");
    System.out.println(transcript); //prints transcript at end of rounds
    }
  }
  }}

  //Wouldve been in while loop

// couldnt get mirror words to work :( 
      //mirror words
//       String response = input.nextLine(); //takes what user says and makes it a variable
//       String [] responseList = response.split(""); // takes new user input variable and splits it 
//       boolean changeUserInput = false; //creates a false boolean



//       //loops that change the mirror words for computer response
//       for (int i = 0; i < responseList.length; i++) {
//         if (responseList[i].equals("I")){
//           int position = i;
//           responseList[position] = ("You");
//           changeUserInput = true;
//         }
//         else if (responseList[i].equals("i")){
//           int position = i;
//           responseList[position] = ("you");
//           changeUserInput = true;
//         }
//         else if (responseList[i].equals("you")){
//           int position = i;
//           responseList[position] = ("I");
//           changeUserInput = true;
//         }
//         else if (responseList[i].equals("You")){
//           int position = i;
//           responseList[position] = ("I");
//           changeUserInput = true;
//         }
//         else if (responseList[i].equals("Your")){
//           int position = i;
//           responseList[position] = ("My");
//           changeUserInput = true;
//         }
//         else if (responseList[i].equals("your")){
//           int position = i;
//           responseList[position] = ("my");
//           changeUserInput = true;
//         }
//         else if (responseList[i].equals("My")){
//           int position = i;
//           responseList[position] = ("Your");
//           changeUserInput = true;
//         }
//         else if (responseList[i].equals("my")){
//           int position = i;
//           responseList[position] = ("your");
//           changeUserInput = true;
//         }
//         else if (responseList[i].equals("am")){
//           int position = i;
//           responseList[position] = ("are");
//           changeUserInput = true;
//         }
//         else if (responseList[i].equals("Am")){
//           int position = i;
//           responseList[position] = ("Are");
//           changeUserInput = true;
//         }
        
//         if (changeUserInput ==  true){
//           String mirrorVers = String.join( "", responseList);
//           System.out.println(mirrorVers + "?"); //rephrases user response as a question
//           transcript.add(mirrorVers + "?"); //adds mirror version of response
//            roundsDone++;   //increases number of rounds completed
//         }

//         // else{
//         //   //how computer responds w/ no mirror words;
//         //   int randNum = random.nextInt(botDialogue.length);// creates a random number that's within the bounds of the length of 'botDialogue's string 
//         //   String response = input.nextLine(); //takes what user said and makes it into a variable "response"
//         //   transcript.add(response); //adds "response" from user to transcript

//         //   System.out.println(botDialogue[randNum]);// bot responds with one of five responses dependng on what random number is generated
//         //   transcript.add(botDialogue[randNum]);// adds bot's response to transcript
          
//         //   roundsDone++; 
//         // }