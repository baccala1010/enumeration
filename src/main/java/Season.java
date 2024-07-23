public enum Season {
    WINTER(-20f), SPRING(5f), SUMMER(25f), AUTUMN(10f);

    private float temperature;

    Season(float temperature) {
        this.temperature = temperature;
    }

    public float getTemperature() {
        return temperature;
    }
}
