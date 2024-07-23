public class Test {
    public static void main(String[] args) {
        Season season = Season.SPRING;

        System.out.println(season.name());

        Animal animal = Animal.TIGER;

        System.out.println(animal.name());

        Animal cat = Animal.valueOf("CAT");
        System.out.println(cat.getTranslation());

        System.out.println(cat.ordinal());
    }
}
