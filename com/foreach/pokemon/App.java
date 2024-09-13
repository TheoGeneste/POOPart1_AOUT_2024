package com.foreach.pokemon;

public class App {
    public static void main(String[] args) {
        // Création des pokemons
        Dresseur theo = new Dresseur("Théo");
        Pokemon pokemon1 = new Pokemon("Pikachu", 100, 10);
        Pokemon pokemon2 = new Dracaufeu("Dracaufeu", 200, 10);
        Pokemon pokemon3 = new Pokemon("Pikachu", 100, 10);
        Pokemon pokemon4 = new Pokemon("Pikachu", 100, 10);
        Pokemon pokemon5 = new Pokemon("Pikachu", 100, 10);
        Pokemon pokemon6 = new Pokemon("Pikachu", 100, 10);
        theo.addPokemon(pokemon1);
        theo.addPokemon(pokemon2);
        theo.addPokemon(pokemon3);
        theo.addPokemon(pokemon4);
        theo.addPokemon(pokemon5);
        theo.addPokemon(pokemon6);

        Dresseur pierre = new Dresseur("Pierre");
        Pokemon pokemonPierre1 = new Pokemon("Pikachu", 100, 5);
        Pokemon pokemonPierre2 = new Dracaufeu("Dracaufeu", 200, 7);
        Pokemon pokemonPierre3 = new Pokemon("Pikachu", 100, 10);
        Pokemon pokemonPierre4 = new Pokemon("Pikachu", 100, 1);
        Pokemon pokemonPierre5 = new Pokemon("Pikachu", 100, 10);
        Pokemon pokemonPierre6 = new Pokemon("Pikachu", 100, 10);
        pierre.addPokemon(pokemonPierre1);
        pierre.addPokemon(pokemonPierre2);
        pierre.addPokemon(pokemonPierre3);
        pierre.addPokemon(pokemonPierre4);
        pierre.addPokemon(pokemonPierre5);
        pierre.addPokemon(pokemonPierre6);

        Combat combat = new Combat();
        combat.combat(theo, pierre);
    }
    
}
