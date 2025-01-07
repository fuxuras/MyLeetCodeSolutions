import java.util.*;

public class Question1408 {
    public List<String> stringMatching(String[] words) {
        Set<String> result = new HashSet<>();
        for (int i = 0; i < words.length; i++) {
            if (result.contains(words[i])){
                continue;
            }
            for (int j = i+1; j < words.length; j++) {
                if (words[i].length() > words[j].length()){
                    if (words[i].contains(words[j])){
                        result.add(words[j]);
                    }
                }else {
                    if(words[j].contains(words[i])){
                        result.add(words[i]);
                        break;
                    }
                }
            }
        }
        return result.stream().toList();
    }
}
