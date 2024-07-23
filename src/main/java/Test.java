public class Test {
    private static final String DOG = "dog";
    public static final String FROG = "frog";
    public static final String COW = "cow";
    public static final String SWAN = "swan";
    public static final String TIGER = "tiger";

    public static void main(String[] args) {
        String animal = DOG;

        switch (animal) {
            case DOG:
                System.out.println("it is a dog");
                break;
            case FROG:
                System.out.println("it is a frog");
                break;
            case COW:
                System.out.println("it is a cow");
                break;
            case SWAN:
                System.out.println("it is a swan");
                break;
            case TIGER:
                System.out.println("it is a tiger");
            default:
                System.out.println("not animal");
        }
    }
}
