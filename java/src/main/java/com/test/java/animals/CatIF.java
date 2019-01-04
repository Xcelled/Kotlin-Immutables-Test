package com.test.java.animals;

import com.hubspot.immutables.style.HubSpotStyle;
import org.immutables.value.Value;

@Value.Immutable
@HubSpotStyle
public interface CatIF extends Animal {
    @Value.Default
    default String getNoise() {
        return "Meow";
    }

    boolean getLikesMilk();
}
