package com.fabulouszanna.pokedex.model

data class PokemonModel(
    val id: Int,
    val name: String,
    val variationName: String?,
    val pokemonId: String,
    val imgUrl: String,
    val type1: String,
    val type2: String? = null,
    val gen: String,
    val isVariation: Boolean,
    val species: String,
    val description: String,
    val height: String,
    val weight: String,
    val malePercentage: String,
    val femalePercentage: String,
    val stats: PokemonStats?,
    val abilities: List<String>,
    val hiddenAbility: String? = null,
    val evolutions: List<String>,
    val evolutionCause: String? = null,
    val splitEvolution: Boolean
)