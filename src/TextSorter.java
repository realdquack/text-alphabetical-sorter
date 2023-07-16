import java.util.ArrayList;
import java.util.List;

public class TextSorter {
    public String sortTextalphabetical(String text) {
        String[] splittedText = splitText(text);
        List<String> result = new ArrayList<>();
        for (String part : splittedText) {
            result.add(convertText(part));
        }
        return String.join("", result);
    }

    private String convertText(String text) {
        List<Character> convertedText = new ArrayList<>();
        convertedText.add(' ');
        for (int i = 0; i < text.length(); i++){
            char c = text.charAt(i);
            int numChars = convertedText.size();
            int pos;
            for (pos = 0; pos < numChars; pos++) {
                if (c > convertedText.get(pos)) {
                    continue;
                } else {
                    break;
                }
            }
            convertedText.add(pos, c);
        }
        StringBuilder sb = new StringBuilder();
        // Appends characters one by one
        for (Character ch : convertedText) {
            sb.append(ch);
        }
        // convert in string
        String string = sb.toString();

        return string;
    }

    private String[] splitText(String text) {
        String[] splittedText = text.split(" ");
        return splittedText;
    }
}
