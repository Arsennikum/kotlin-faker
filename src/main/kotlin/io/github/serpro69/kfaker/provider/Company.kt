package io.github.serpro69.kfaker.provider

import io.github.serpro69.kfaker.*
import io.github.serpro69.kfaker.dictionary.*

/**
 * [FakeDataProvider] implementation for [CategoryName.COMPANY] category.
 */
class Company internal constructor(fakerService: FakerService) : AbstractFakeDataProvider(fakerService) {
    override val categoryName = CategoryName.COMPANY

    val buzzwords = resolve { fakerService.resolve(Faker, it, "buzzwords") }
    val bs = resolve { fakerService.resolve(Faker, it, "bs") }
    val name = resolve { fakerService.resolve(Faker, it, "name") }
    val industry = resolve { fakerService.resolve(Faker, it, "industry") }
    val profession = resolve { fakerService.resolve(Faker, it, "profession") }
    val type = resolve { fakerService.resolve(Faker, it, "type") }
}