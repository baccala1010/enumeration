public enum Animal {
    DOG("dog"), CAT("cat"), FROG("frog"), SWAN("swan"), TIGER("tiger"), PIG("pig");

    private String translation;

    Animal(String translation) {
        this.translation = translation;
    }

    public String getTranslation() {
        return translation;
    }

    @Override
    public String toString() {
        return "Translation: " + translation;
    }
}
