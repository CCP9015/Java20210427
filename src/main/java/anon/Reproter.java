package anon;

public class Reproter {
    public static void main(String[] args) {
        WeatherReproter weatherReproter = new WeatherReproter();
        Patrick patrick = new Patrick();
        weatherReproter.print();
        patrick.print();
        Reporter reporter = new Reporter() {
            @Override
            public void print() {
                System.out.println("ding ding dong dong");
            }
        };
        reporter.print();
    }
}
