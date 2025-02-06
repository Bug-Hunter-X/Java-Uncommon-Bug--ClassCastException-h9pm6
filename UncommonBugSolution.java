public class UncommonBugSolution {
    public static void main(String[] args) {
        try {
            Object obj = "123";
            if (obj instanceof Integer) {
                Integer num = (Integer) obj;
                System.out.println(num);
            } else if (obj instanceof String) {
                try {
                    Integer num = Integer.parseInt((String) obj);
                    System.out.println(num);
                } catch (NumberFormatException e) {
                    System.out.println("Not a valid Integer string: " + e.getMessage());
                }
            } else {
                System.out.println("Object is not an Integer or String");
            }
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
    }
}