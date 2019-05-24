public class StringTraining {

    /**
     * @param firstname, ie : "Brandon"
     * @return a string that concatenates "Hello " and firstname, ie : "Hello Brandon"
     */
    public static String helloFirstname(String firstname) {
        firstname = "Brandon";
        return "Hello " + firstname;
    }

    /**
     * @param first  word, ie : "test"
     * @param second word, ie : "value"
     * @return a string with both word, ie : "testvalue"
     */
    public static String concatArgs(String first, String second) {
        first = "test";
        second = "value";
        return first + second;
    }

    /**
     * @param origin  string, ie: "test"
     * @param compare string, ie: "sample"
     * @return if origin string is equal to compare string
     */
    public static boolean equals(String origin, String compare) {
        if(origin == compare){
            return true;
        }
        return false;
    }

    /**
     * @param value character, ie: 't'
     * @return conversion of the character into String, ie: "t"
     */
    public static String charToString(char value) {
        value = 't';
        String result = Character.toString(value);
        return result;
    }

    /**
     * @param value integer, ie: 3
     * @return convertion of the integer into String, ie: "3"
     */
    public static String intToString(int value) {
        value = 3;
        String result = String.valueOf(value);
        return result;
    }

    /**
     * @param string, ie: "test"
     * @return string length, ie: 4
     */
    public static int length(String string) {
        string = "test";
        int result = string.length();
        return result;
    }

    /**
     * @param string, ie "test"
     * @return string in upper case, ie: "TEST"
     */
    public static String upper(String string) {
        string = "test";
        String result = string.toUpperCase();
        return result;
    }

    /**
     * @param string, ie: "TEST"
     * @return string in lower case, ie: "test"
     */
    public static String lower(String string) {
        string = "TEST";
        String result = string.toLowerCase();
        return result;
    }

    /**
     * @param string, ie: "test"
     * @return first character of the string, ie: 't'
     */
    public static char firstChar(String string) {
        string = "test";
        char result = string.charAt(0);
        return result;
    }

    /**
     * @param string, ie: "value"
     * @return last character of the string, ie: 'e'
     */
    public static char lastChar(String string) {
        string = "value";
        char result = string.charAt(string.length());
        return result;
    }

    /**
     * @param string, ie: "test"
     * @param begin   position (inclusive) of the substring, ie: 1
     * @param end     postion (exclusive) of the substring, ie: 3
     * @return the substring from begin position to end position, ie: "es"
     */
    public static String subString(String string, int begin, int end) {
        // https://howtodoinjava.com/java/string/java-string-substring-example/
        begin = 1;
        end = 3;
        string ="test";
        String result = "";
        for(int i = 0;i<end || i>begin;i++){
          result += Character.toString(string.charAt(i));
        }
        return result;
    }

    /**
     * @param string, ie: "test"
     * @return the string with the first character in upper case, ie: "Test"
     */
    public static String firstUpper(String string) {
        string = "test";
        String result = "";
        for(int i =0; i<string.length();i++){
            result += Character.toString(string.charAt(0));
            if(i > 0){
                result += Character.toString(string.charAt(i));
            }
        }
        return result;
    }

    /**
     * @param string, ie: "test"
     * @param search  character, ie: 't'
     * @return the number of character occurrences in string, ie: 2
     */
    public static int occurrences(String string, char search) {
        string = "test";
        search = 't';
        int compteur = 0;
        for(int i = 0;i<string.length();i++){
            if(search == string.charAt(i)){
                compteur++;
            }
        }
        return compteur;
    }

    /**
     * @param string,  ie: "test"
     * @param search,  ie: 't'
     * @param replace, ie: 'w'
     * @return the string where searched characters are replaced, ie: "wesw"
     */
    public static String replaceChar(String string, char search, char replace) {
        string = "test";
        search = 't';
        replace = 'w';
        String result = "";
        for(int i =0;i<string.length();i++){
            if(search == string.charAt(i)){
                result += Character.toString(replace);
            }
            result += Character.toString(string.charAt(i));
        }
        return result;
    }

    /**
     * @param string,  ie: "test"
     * @param search,  ie: "e"
     * @param replace, ie: "oa"
     * @return the string where searched substring are replaced, ie: "toast"
     */
    public static String replaceString(String string, String search, String replace) {
        string = "test";
        search = "e";
        replace = "oa";
        String result = "";
        for(int i = 0;i<string.length();i++){
            if(search.charAt(0) == string.charAt(i)){
                result += replace;
            }
            result += Character.toString(string.charAt(i));
        }
        return result;
    }

    /**
     * @param string,    ie: "test|value"
     * @param delimiter, ie: "|"
     * @return string array that contains values splited on the delimiter, ie: {"test", "value"}
     */
    public static String[] split(String string, String delimiter) {
        // https://howtodoinjava.com/java/string/java-string-split-example/
        string = "test|value";
        delimiter = "|";
        String[] result;
        result = string.split(delimiter);
        return result;
    }

    /**
     * @param strings    array, ie: {"test", "value"}
     * @param delimiter, ie: ";"
     * @return string of array values joined with the delimiter, ex: "test;value"
     */
    public static String join(String[] strings, String delimiter) {
        // https://howtodoinjava.com/java8/java-8-join-string-array-example/
        strings[0] = "test";
        strings[1] ="value";
        delimiter = ";";
        String result = "";
        result += strings[0] + delimiter + strings[1];
        return result;
    }
}
