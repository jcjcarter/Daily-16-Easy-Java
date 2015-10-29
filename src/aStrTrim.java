/**
 * Created by TZ6YSQ on 10/28/2015.
 */
public class aStrTrim implements iStrTrim {
    /**
     * Takes in a string and removes
     * the alphabets found in the
     * letters.
     *
     * @param word    String to be modified.
     * @param letters String to do the modifying.
     * @return the modified string.
     */
    @Override
    public String wordTrim(String word, String letters) {

        /* Array to modify the word. */
       char[] arrayWord = word.toCharArray();

       char[] arrayLetters = letters.toCharArray();

        StringBuilder stringBuilder = new StringBuilder("");

        for (int i = 0; i < arrayLetters.length; i++) {
            for (int j = 0; j < arrayWord.length; j++) {
                if (arrayLetters[i] == arrayWord[j]) arrayWord[j] = '`';
            }
        }

        for (int i = 0; i < arrayWord.length; i++) {
            if (arrayWord[i] == '`') continue;

            else stringBuilder.append(arrayWord[i]);
        }

        return stringBuilder.toString();
    }
}
