import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.auto.value.AutoValue;
import org.checkerframework.checker.nullness.qual.Nullable;

@AutoValue
public abstract class Animal {
    @JsonProperty("name")
    public abstract String getName();

    @Nullable
    @JsonProperty("age")
    public abstract Color getColor();

    @JsonCreator
    public static Animal create(@JsonProperty("name") final String name, @JsonProperty("color") final Color color) {
        return new AutoValue_Animal(name, color);
    }
}
