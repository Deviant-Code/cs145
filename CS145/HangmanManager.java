import java.util.*;
import java.io.*;
public class HangmanManager {

   private int max;
   private SortedSet<String> wordSet = new TreeSet<String>();
   private SortedSet<Character> guesses = new TreeSet<Character>();
   private String wordPattern;
   
   public HangmanManager(List<String> dictionary, int length, int max){
         this.max = max;
         this.wordSet = trimList(dictionary, length);
   }
   
   public SortedSet<String> trimList(List<String> dictionary, int length){
         
         for(String currWord: dictionary){
               if((currWord.length() == length) && (!wordSet.contains(currWord))){
                  wordSet.add(currWord);
               }
          }
          
         return wordSet;
   }
   
   public SortedSet<String> words(){
         return wordSet;
   
   }
   
   public int guessesLeft(){
         return max;
   }
   
   public SortedSet<Character> guesses(){
         return guesses;
   }
   
    public String pattern(){
          return wordPattern;   
     
    }
   
   public int record(char guess){
      Map<String, SortedSet<String>> wordSort = new TreeMap<String, SortedSet<String>>();
      createWordLists(wordSort, guess);
      String listKey = updateList(wordSort, guess);
      updateHangmanPattern(listKey);
      return countOccurences(listKey, guess);
      
   }
   
   public void updateHangmanPattern(String listKey){
      if(!wordPattern.equals(listKey)){
         for(int i = 0; i < wordPattern.length(); i++){
            if(!(wordPattern.charAt(i) == listKey.charAt(i) || listKey.charAt(i) == '-')){
               wordPattern = wordPattern.substring(0,i) + listKey.charAt(i) + wordPattern.substring(i+1);
            }   
         }
      }
   }
   
   public int countOccurences(String key, char guess){
      int occurences = 0;
      for(int i = 0; i < key.length(); i++){
         if(key.charAt(i) == guess){
            occurences++;
         }
      }
      
      return occurences;
   
   }
   
   public String updateList(Map<String, SortedSet<String>> wordSort, char guess){
      //set not sorted? wtf?
      Set<String> keyList = wordSort.keySet();
      String longestList = "";
      int maxListSize = 0;
      for(String key: keyList){
         if(wordSort.get(key).size() > maxListSize){
            maxListSize = wordSort.get(key).size();
            longestList = key;
         }
      }
      wordSet = wordSort.get(longestList);
      return longestList;
   }
   
   
   public void createWordLists(Map<String, SortedSet<String>> wordSort, char guess){ 
      for(String currentWord: wordSet){
         String revealedWord = convertWord(currentWord, guess);
         SortedSet<String> revealedList = new TreeSet<String>();
         if(wordSort.containsKey(revealedWord)){
            revealedList = wordSort.get(revealedWord);
         }
         revealedList.add(currentWord);
         wordSort.put(revealedWord, revealedList);
      }
   
   }
   
   public String convertWord(String currentWord, char guess){
      String convertedWord = "";
      for(int i = 0; i < currentWord.length(); i++){
         if(currentWord.charAt(i) == guess){
            convertedWord += guess + " ";
         } else {
            convertedWord += "- ";
         }
      }
      return convertedWord;
   }
   

}