import java.util.*;
import java.io.*;
public class HangmanManager {

   private int max;
   private Set<String> wordSet = new TreeSet<String>();
   private Set<Character> guesses = new TreeSet<Character>();
   
   public HangmanManager(List<String> dictionary, int length, int max){
         this.max = max;
         this.wordSet = trimList(dictionary, length);

   }
   
   public Set<String> trimList(List<String> dictionary, int length){
         
         for(String currWord: dictionary){
               if((currWord.length() == length) && (!wordSet.contains(currWord))){
                  wordSet.add(currWord);
               }
          }
          
         return wordSet;
   }
   
   public Set<String> words(){
         return wordSet;
   
   }
   
   public int guessesLeft(){
         return max;
   }
   
//    public SortedSet<Character> guesses(){
//          return guesses;
//    }
   
//    public String pattern(){
//          
//    
//    }

}