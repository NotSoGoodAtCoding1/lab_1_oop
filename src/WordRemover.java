import java.util.HashMap;
import java.util.Map;

class WordRemover implements ITextProcessor {
    @Override
    public String processText(String text) {
        String[] words = text.split("\\s+");
        Map<String, Integer> wordFrequency = new HashMap<>();

        for (String word : words) {
            word = word.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
            if (!word.isEmpty()) {
                wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
            }
        }

        StringBuilder result = new StringBuilder();
        for (String word : words) {
            word = word.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
            if (!word.isEmpty() && wordFrequency.get(word) > 1) {
                result.append(word).append(" ");
            }
        }

        return result.toString().trim();
    }
}
