import java.util.ArrayList;
import java.util.Collections;

public class StringManipulation {

    private static String str2 = "Parse this String";
    private static String sentence = "This is my sentence";

    private static ArrayList<String> words = new ArrayList<>();

    private static String[] words2 = sentence.split(" "); //use split("[ab]") to split more than one character
    private static String[] tokens = sentence.split("i"); //replaces the selected character with token


    public static void main(String[] args) {

        parseString(str2);
        System.out.println("\nThere are " + words.size() + " words in the original String");

        Collections.sort(words);
        System.out.println(words);

        splitString();

    }

    //parsing a string using a for loop
    public static void parseString(String str){

        while (str.length() > 0){

            for (int i = 0; i <str.length(); i++){

                if (i == str.length()-1){

                    words.add(str.substring(0));
                    str = "";
                    break;

                }//end if

                //checking if there are spaces
                else if(str.charAt(i) == ' '){

                    words.add(str.substring(0,i));
                    str = str.substring(i+1);
                    break;

                }//end else if

                for (String s: words){

                    System.out.println(s + ' ');

                }//end for loop

            }//end for loop

        }//end while


    }//end parseString

    public static void splitString(){

        for (String token: tokens){

            System.out.print(token + ", ");

        }

        System.out.println("\n");

        for(String words: words2){

            System.out.print(words + ", ");

        }

    }

}//end class
