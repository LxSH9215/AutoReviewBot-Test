import java.util.*;

public class ViolationTest {
    // Violation: Public mutable field (ENCAPSULATION)
    public List<String> items = new ArrayList<>();

    // Violation: Null return (AVOID_NULL_RETURN)
    public String getName() {
        return null; // ❌ Should return Optional
    }

    // Violation: Unused parameter (UNUSED_PARAM)
    public void unusedParam(String param) {
        int unusedVar = 0; // ❌ Unused variable
    }

    // Violation: Magic number (MAGIC_NUMBER)
    public int calculate() {
        return 100 * 42; // ❌ 42 is magic number
    }

    // Violation: Empty catch block (EMPTY_BLOCK)
    public void riskyMethod() {
        try {
            // Code that may fail
        } catch (Exception e) {
            // ❌ Empty catch block
        }
    }
}
