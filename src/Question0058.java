public class Question0058 {
    public int lengthOfLastWord(String s) {
        int length = 0;
        int index = s.length() -1;
        while (s.charAt(index)  == ' '){
            index--;
        }
        while (index >= 0 && s.charAt(index) != ' ' ){
            length++;
            index--;
        }
        return length;
    }
}
