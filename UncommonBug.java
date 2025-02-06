public class UncommonBug {
    public static void main(String[] args) {
        try {
            // Simulate an uncommon error: trying to cast an incompatible object to Integer
            Object obj = "123";
            Integer num = (Integer) obj; // ClassCastException
            System.out.println(num);
        } catch (ClassCastException e) {
            System.out.println("Uncommon Error Caught: " + e.getMessage());
            // Handle the ClassCastException more gracefully
            // Instead of simply printing the message, you might want to log it
            // and/or take alternative actions.
        } catch (Exception e) {
            System.out.println("Another exception has been caught: " + e.getMessage());
        }
    }
}