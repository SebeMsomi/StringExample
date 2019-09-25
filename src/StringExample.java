import java.util.ArrayList;
import java.util.Collections;

public class StringExample {

    private static String str = "Sample String";


    public static void main(String[] args) {

        displayString(str);
        displayBackwardString(str);
        searchString(str,'S');


    }//end main

    public static void displayString(String str) {

        System.out.println(str);

        //iterates through str and prints each character on a new line
        for (int i = 0; i <str.length(); i++){

            System.out.print(str.charAt(i));

        }//end of for loop

    }//end displayString

    public static void displayBackwardString(String str){

        String backwards ="";

        for (int i = str.length() - 1; i >= 0; i--){

            backwards += str.substring(i,i+1);

        }//end of backwards for loop

        System.out.println(backwards);

    }//end display backwards

    public static void searchString(String str, char c){

        int count = 0;

        for (int i = 0; i<str.length()-1; i++){

            if(str.charAt(i) == c){

                count++;

            }//end if

        }//end for loop

        System.out.println("The character " + c + " appears in the text "
                            + count + " times.");

    }//end searchString

}//end class
