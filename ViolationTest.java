public class ViolationTest {
    // PROTECT_MUTABLE_STATE violation
    public List<String> items;
    
    // AVOID_NULL_RETURN violation
    public String getName() {
        return null;
    }
    
    public void process() {
        // TODO_COMMENT violation
        // TODO: Implement this later
        
        // CODE_TO_INTERFACES violation
        ArrayList<String> list = new ArrayList<>();
        
        // USE_STREAMS violation
        for (String s : list) {
            System.out.println(s);
        }
    }
}
