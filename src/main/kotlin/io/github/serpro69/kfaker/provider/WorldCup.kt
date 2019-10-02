package io.github.serpro69.kfaker.provider

import io.github.serpro69.kfaker.*
import io.github.serpro69.kfaker.dictionary.*

/**
 * [FakeDataProvider] implementation for [CategoryName.WORLD_CUP] category.
 */
@Suppress("unused")
class WorldCup internal constructor(fakerService: FakerService) : AbstractFakeDataProvider(fakerService) {
    override val categoryName = CategoryName.WORLD_CUP

    val teams = resolve { fakerService.resolve(it, "teams") }
    val stadiums = resolve { fakerService.resolve(it, "stadiums") }
    val cities = resolve { fakerService.resolve(it, "cities") }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Not fully implemented")
    val groups: (group: String) -> String = { group ->
        resolve { fakerService.resolve(it, "groups", group) }.invoke()
        // TODO: 3/10/2019 better resolving of group names
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Not fully implemented")
    val roosters: (rooster: Pair<String, String>) -> String = { (country, type) ->
        resolve { fakerService.resolve(it, "roosters", country, type) }.invoke()
        // TODO: 3/10/2019 better resoving of rooster for different countries and types
    }
}
