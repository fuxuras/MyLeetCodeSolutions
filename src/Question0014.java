public class Question0014 {
    public String longestCommonPrefix(String[] strs){
        String prefix = strs[0];

        for (String str: strs){
            int len = Math.min(str.length(), prefix.length());
            int lenOfPrefix = 0;
            for (int i = 0; i < len; i++) {
                if(str.charAt(i) == prefix.charAt(i)){
                    lenOfPrefix++;
                }else {
                    break;
                }
            }
            prefix = prefix.substring(0,lenOfPrefix);
        }
        return prefix;
    }
}
