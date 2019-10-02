package io.github.serpro69.kfaker.provider

import io.github.serpro69.kfaker.*
import io.github.serpro69.kfaker.dictionary.*

/**
 * [FakeDataProvider] implementation for [CategoryName.SEINFELD] category.
 */
@Suppress("unused")
class Seinfeld internal constructor(fakerService: FakerService) : AbstractFakeDataProvider(fakerService) {
    override val categoryName = CategoryName.SEINFELD

    val character = resolve { fakerService.resolve(it, "character") }
    val quote = resolve { fakerService.resolve(it, "quote") }
    val business = resolve { fakerService.resolve(it, "business") }
}
