import java.util.*;

public class TextProcessorApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose an option:\n1. Remove non-repeating words\n2. Count unique and total words\n3. Remove repeating words");
        int option = scanner.nextInt();
        scanner.nextLine(); // consume newline
        ITextProcessor textProcessor;
        switch (option) {
            case 1:
                textProcessor = new WordRemover();
                break;
            case 2:
                textProcessor = new WordCounter();
                break;
            case 3:
                textProcessor = new WordDuplicateRemover();
                break;
            default:
                System.out.println("Invalid option. Exiting...");
                return;
        }
        System.out.println("Enter text:");
        String inputText = scanner.nextLine();
        String processedText = textProcessor.processText(inputText);
        System.out.println("Processed text:\n" + processedText);
    }
}