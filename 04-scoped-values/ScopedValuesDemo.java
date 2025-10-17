import jdk.incubator.*;

public class ScopedValuesDemo {
    static final ScopedValue<String> USER = ScopedValue.newInstance();

    public static void main(String[] args) {
        ScopedValue.where(USER, "Alice").run(() -> {
            processRequest();
        });
    }

    static void processRequest() {
        System.out.println("Processing request for user: " + USER.get());
    }
}