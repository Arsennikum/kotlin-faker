package io.github.serpro69.kfaker.provider

import io.github.serpro69.kfaker.*
import io.github.serpro69.kfaker.dictionary.*

/**
 * [FakeDataProvider] implementation for [CategoryName.HEY_ARNOLD] category.
 */
@Suppress("unused")
class HeyArnold internal constructor(fakerService: FakerService) : AbstractFakeDataProvider(fakerService) {
    override val categoryName = CategoryName.HEY_ARNOLD

    val characters = resolve { fakerService.resolve(it, "characters") }
    val locations = resolve { fakerService.resolve(it, "locations") }
    val quotes = resolve { fakerService.resolve(it, "quotes") }
}
