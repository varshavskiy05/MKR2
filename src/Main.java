public class Main {
    public static void main(String[] args) {
        Arena arena = new Arena();

        Character warrior = CharacterFactory.createCharacter("Warrior", "Thor", 0, 0);
        Character mage = CharacterFactory.createCharacter("Mage", "Gandalf", 5, 5);
        Character archer = CharacterFactory.createCharacter("Archer", "Legolas", 10, 10);

        arena.addCharacter(warrior);
        arena.addCharacter(mage);
        arena.addCharacter(archer);

        arena.characterMove(warrior, 3, 3);
        arena.characterAttack(warrior, mage);
    }
}
