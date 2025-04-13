package ca.dragonbyte.birds.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import ca.dragonbyte.birds.R


/**
 * A data class to represent the information presented in the bird card
 */
data class Bird(
    @DrawableRes val imageResourceId: Int, // Bird image
    @StringRes val commonName: Int,        // Common name
    @StringRes val scientificName: Int,    // Scientific Name
    @StringRes val description:Int         // Prose description
)

val birds = listOf<Bird>(
    // American Avocet
    Bird(R.drawable.american_avocet, R.string.american_avocet,
        R.string.american_avocet_binomial, R.string.american_avocet_desc),
    // American Crow
    Bird(R.drawable.american_crow, R.string.american_crow,
        R.string.american_crow_binomial, R.string.american_crow_desc),
    // American Robin
    Bird(R.drawable.american_robin, R.string.american_robin,
    R.string.american_robin_binomial, R.string.american_robin_desc),
    // Anna's Hummingbird
    Bird(R.drawable.annas_hummingbird, R.string.annas_hummingbird,
    R.string.annas_hummingbird_binomial, R.string.annas_hummingbird_desc),
    // Baltimore Oriole
    Bird(R.drawable.baltimore_oriole, R.string.baltimore_oriole,
    R.string.baltimore_oriole_binomial, R.string.baltimore_oriole_desc),
    // Bohemian Waxwing
    Bird(R.drawable.bohemian_waxwing, R.string.bohemian_waxwing,
    R.string.bohemian_waxwing_binomial, R.string.bohemian_waxwing_desc),
    // Brown Creeper
    Bird(R.drawable.brown_creeper, R.string.brown_creeper,
    R.string.brown_creeper_binomial, R.string.brown_creeper_desc),
    // Chestnut-sided Warbler
    Bird(R.drawable.chestnut_sided_warbler, R.string.chestnut_sided_warbler,
    R.string.chestnut_sided_warbler_binomial, R.string.chestnut_sided_warbler_desc),
    // Clark's Nutcracker
    Bird(R.drawable.clarks_nutcracker, R.string.clarks_nutcracker,
    R.string.clarks_nutcracker_binomial, R.string.clarks_nutcracker_desc),
    // Common Raven
    Bird(R.drawable.common_raven, R.string.common_raven,
    R.string.common_raven_binomial, R.string.common_raven_desc),
    // Evening Grosbeak
    Bird(R.drawable.evening_grosbeak, R.string.evening_grosbeak,
    R.string.evening_grosbeak_binomial, R.string.evening_grosbeak_desc),
    // Fox Sparrow
    Bird(R.drawable.fox_sparrow, R.string.fox_sparrow,
    R.string.fox_sparrow_binomial, R.string.fox_sparrow_desc),
    // Hermit Thrush
    Bird(R.drawable.hermit_thrush, R.string.hermit_thrush,
    R.string.hermit_thrush_binomial, R.string.hermit_thrush_desc),
    // Killdeer
    Bird(R.drawable.killdeer, R.string.killdeer,
    R.string.killdeer_binomial, R.string.killdeer_desc),
    // Lincoln's Sparrow
    Bird(R.drawable.lincolns_sparrow, R.string.lincolns_sparrow,
    R.string.lincolns_sparrow_binomial, R.string.lincolns_sparrow_desc),
    // Mandarin Duck
    Bird(R.drawable.mandarin_duck, R.string.mandarin_duck,
    R.string.mandarin_duck_binomial, R.string.mandarin_duck_desc),
    // Mountain Bluebird
    Bird(R.drawable.mountain_bluebird, R.string.mountain_bluebird,
    R.string.mountain_bluebird_binomial, R.string.mountain_bluebird_desc),
    // Northern Pintail
    Bird(R.drawable.northern_pintail, R.string.northern_pintail,
    R.string.northern_pintail_binomial, R.string.northern_pintail_desc),
    // Red-breasted Nuthatch
    Bird(R.drawable.red_breasted_nuthatch, R.string.red_breasted_nuthatch,
    R.string.red_breasted_nuthatch_binomial, R.string.red_breasted_nuthatch_desc),
    // Red-winged Blackbird
    Bird(R.drawable.red_winged_blackbird, R.string.red_winged_blackbird,
    R.string.red_winged_blackbird_binomial, R.string.red_winged_blackbird_desc),
    // Ring-necked Duck
    Bird(R.drawable.ring_necked_duck, R.string.ring_necked_duck,
    R.string.ring_necked_duck_binomial, R.string.ring_necked_duck_desc),
    // Rusty Blackbird
    Bird(R.drawable.rusty_blackbird, R.string.rusty_blackbird,
    R.string.rusty_blackbird_binomial, R.string.rusty_blackbird_desc),
    // Sandhill Crane
    Bird(R.drawable.sandhill_crane, R.string.sandhill_crane,
    R.string.sandhill_crane_binomial, R.string.sandhill_crane_desc),
    // Song Sparrow
    Bird(R.drawable.song_sparrow, R.string.song_sparrow,
    R.string.song_sparrow_binomial, R.string.song_sparrow_desc),
    // Spotted Towhee
    Bird(R.drawable.spotted_towhee, R.string.spotted_towhee,
    R.string.spotted_towhee_binomial, R.string.spotted_towhee_desc),
    // Stellar's Jay
    Bird(R.drawable.stellars_jay, R.string.stellars_jay,
    R.string.stellars_jay_binomial, R.string.stellars_jay_desc),
    // Tree Swallow
    Bird(R.drawable.tree_swallow, R.string.tree_swallow,
    R.string.tree_swallow_binomial, R.string.tree_swallow_desc),
    // Upland Sandpiper
    Bird(R.drawable.upland_sandpiper, R.string.upland_sandpiper,
    R.string.upland_sandpiper_binomial, R.string.upland_sandpiper_desc),
    // Yellow-headed Blackbird
    Bird(R.drawable.yellow_headed_blackbird, R.string.yellow_headed_blackbird,
    R.string.yellow_headed_blackbird_binomial, R.string.yellow_headed_blackbird_desc),
    // Yellow Warbler
    Bird(R.drawable.yellow_warbler, R.string.yellow_warbler,
    R.string.yellow_warbler_binomial, R.string.yellow_warbler_desc)
)

