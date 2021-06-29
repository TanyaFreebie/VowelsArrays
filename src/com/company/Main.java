package com.company;

public class Main {

    public static void main(String[] args) {
        String phrase = "Pineapple";

        phrase = phrase.toLowerCase();


        char[] letters = phrase.toCharArray();

        int count = 0;

        for (int i = 0; i < phrase.length(); i++)
        {
            if (phrase.charAt(i) == 'a'
                    || phrase.charAt(i) == 'e'
                    || phrase.charAt(i) == 'i'
                    || phrase.charAt(i) == 'o'
                    || phrase.charAt(i) == 'u')
            {

                count++;
            }
        }

        // display total count of vowels in string
        System.out.println("Word -"+ phrase + "- has " + count + " vowels and " + phrase.length() +" letters in total.");
    }
}
