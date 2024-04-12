import java.util.HashSet;
import java.util.Set;

class WordCounter extends WordRemover {
    @Override
    public String processText(String text) {
        String[] words = text.split("\\s+");
        Set<String> uniqueWords = new HashSet<>();
        for (String word : words) {
            uniqueWords.add(word.toLowerCase().replaceAll("[^a-zA-Z]", ""));
        }
        int totalWords = words.length;
        int uniqueWordCount = uniqueWords.size();
        return "Total words: " + totalWords + "\nUnique words: " + uniqueWordCount;
    }
}
