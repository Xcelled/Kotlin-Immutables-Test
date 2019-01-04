package com.test.kotlin.animals

import com.hubspot.immutables.style.HubSpotStyle
import org.immutables.value.Value

@Value.Immutable
@HubSpotStyle
abstract class AbstractCat : Animal {
    override val noise: String
        //@Value.Default
        get() = "Meow"

    abstract val likesMilk: Boolean
}
