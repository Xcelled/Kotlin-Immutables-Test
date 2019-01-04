package com.test.kotlin.animals

import com.hubspot.immutables.style.HubSpotStyle
import org.immutables.value.Value

@Value.Immutable
@HubSpotStyle
interface BallIF {
    val color: String
}
