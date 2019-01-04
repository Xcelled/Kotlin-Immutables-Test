package com.test.java.animals;

import com.hubspot.immutables.style.HubSpotStyle;
import org.immutables.value.Value;

import java.util.List;

@Value.Immutable
@HubSpotStyle
public interface DogIF extends Animal {
    @Value.Default
    default String getNoise() {
        return "Woof";
    }

    List<Ball> getBalls();
}
