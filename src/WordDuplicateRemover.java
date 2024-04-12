import java.util.HashSet;
import java.util.Set;

class WordDuplicateRemover extends WordRemover {
    @Override
    public String processText(String text) {
        String[] words = text.split("\\s+");
        Set<String> uniqueWords = new HashSet<>();
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            String cleanedWord = word.toLowerCase().replaceAll("[^a-zA-Z]", "");
            if (!uniqueWords.contains(cleanedWord)) {
                result.append(word).append(" ");
                uniqueWords.add(cleanedWord);
            }
        }
        return result.toString().trim();
    }
}
