import java.util.*;
interface StringProcessor {
    String process(String str);
}

public class Lambda {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");
        strings.sort((s1, s2) -> s2.compareTo(s1)); 
        System.out.println("Sorted in reverse: " + strings);
        StringProcessor toUpperCaseProcessor = str -> str.toUpperCase();
        System.out.println("Uppercase:");
        strings.forEach(str -> System.out.println(toUpperCaseProcessor.process(str)));
    }
}