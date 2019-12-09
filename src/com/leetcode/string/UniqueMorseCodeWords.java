package com.leetcode.string;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by perl on 2019/7/12.
 *
 * 804. Unique Morse Code Words
 *
 * International Morse Code defines a standard encoding where each letter is mapped to a series of dots and dashes,
 * as follows: "a" maps to ".-", "b" maps to "-...", "c" maps to "-.-.", and so on.
 * For convenience, the full table for the 26 letters of the English alphabet is given below:
 *
 * []
 *
 * Now, given a list of words, each word can be written as a concatenation of the Morse code of each letter.
 * For example, "cba" can be written as "-.-..--...", (which is the concatenation "-.-." + "-..." + ".-").
 * We'll call such a concatenation, the transformation of a word.
 *
 * Return the number of different transformations among all words we have.
 *
 * Example:
 * Input: words = ["gin", "zen", "gig", "msg"]
 * Output: 2
 * Explanation:
 * The transformation of each word is:
 * "gin" -> "--...-."
 * "zen" -> "--...-."
 * "gig" -> "--...--."
 * "msg" -> "--...--."
 *
 * There are 2 different transformations, "--...-." and "--...--.".
 *
 * Note:
 *
 * The length of words will be at most 100.
 * Each words[i] will have length in range [1, 12].
 * words[i] will only consist of lowercase letters.

 */
public class UniqueMorseCodeWords {

    public static int uniqueMorseRepresentations(String[] words) {
        if (words == null || words.length == 0) {
            return 0;
        }

        Map<String,Integer> COUNT_MAP = new HashMap<>(words.length);
        Map<Character,String> MORSE_CODE_MAP = new HashMap<>(26);
        MORSE_CODE_MAP.put('a',".-");
        MORSE_CODE_MAP.put('b',"-...");
        MORSE_CODE_MAP.put('c',"-.-.");
        MORSE_CODE_MAP.put('d',"-..");
        MORSE_CODE_MAP.put('e',".");
        MORSE_CODE_MAP.put('f',"..-.");
        MORSE_CODE_MAP.put('g',"--.");
        MORSE_CODE_MAP.put('h',"....");
        MORSE_CODE_MAP.put('i',"..");
        MORSE_CODE_MAP.put('j',".---");
        MORSE_CODE_MAP.put('k',"-.-");
        MORSE_CODE_MAP.put('l',".-..");
        MORSE_CODE_MAP.put('m',"--");
        MORSE_CODE_MAP.put('n',"-.");
        MORSE_CODE_MAP.put('o',"---");
        MORSE_CODE_MAP.put('p',".--.");
        MORSE_CODE_MAP.put('q',"--.-");
        MORSE_CODE_MAP.put('r',".-.");
        MORSE_CODE_MAP.put('s',"...");
        MORSE_CODE_MAP.put('t',"-");
        MORSE_CODE_MAP.put('u',"..-");
        MORSE_CODE_MAP.put('v',"...-");
        MORSE_CODE_MAP.put('w',".--");
        MORSE_CODE_MAP.put('x',"-..-");
        MORSE_CODE_MAP.put('y',"-.--");
        MORSE_CODE_MAP.put('z',"--..");

        for (String s : words) {
            StringBuilder sb = new StringBuilder();
            for (char c : s.toCharArray()) {
                sb.append(MORSE_CODE_MAP.get(c));
            }

            if (COUNT_MAP.containsKey(sb.toString())) {
                COUNT_MAP.put(sb.toString(),COUNT_MAP.get(sb.toString()) + 1);
            }else {
                COUNT_MAP.put(sb.toString(),1);
            }
        }

        return COUNT_MAP.size();
    }

    public static void main(String[] args) {
        System.out.println(UniqueMorseCodeWords.uniqueMorseRepresentations(new String[]{"gin","zen","gig","msg"}));
    }
}
