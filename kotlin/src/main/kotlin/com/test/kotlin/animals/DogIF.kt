package com.test.kotlin.animals

import com.hubspot.immutables.style.HubSpotStyle
import org.immutables.value.Value

@Value.Immutable
@HubSpotStyle
interface DogIF : Animal {
    override val noise: String
        @Value.Default
        get() = "Woof"

    val balls: List<Ball>
}
