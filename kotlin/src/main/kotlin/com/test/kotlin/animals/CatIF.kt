package com.test.kotlin.animals

import com.hubspot.immutables.style.HubSpotStyle
import org.immutables.value.Value

@Value.Immutable
@HubSpotStyle
interface CatIF : Animal {
    override val noise: String
        @Value.Default
        get() = "Meow"

    val likesMilk: Boolean
}
