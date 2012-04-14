package decoratorpatternstarbuzz;

/**
 * Super abstract class Beverage
 * Beverage acts as our abstract component class.
 * @author deepshikha
 */
public abstract class Beverage {

    String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
