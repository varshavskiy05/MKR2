public class CharacterFactory {
    public static Character createCharacter(String type, String name, int x, int y) {
        switch (type) {
            case "Warrior":
                return new Warrior(name, x, y);
            case "Mage":
                return new Mage(name, x, y);
            case "Archer":
                return new Archer(name, x, y);
            default:
                throw new IllegalArgumentException("Unknown character type");
        }
    }
}
