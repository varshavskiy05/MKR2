import java.util.ArrayList;
import java.util.List;

public class Arena {
    private List<Character> characters = new ArrayList<>();

    public void addCharacter(Character character) {
        characters.add(character);
        System.out.println(character.name + " has entered the arena at (" + character.x + "," + character.y + ")");
        notifyObservers();
    }

    public void removeCharacter(Character character) {
        characters.remove(character);
        System.out.println(character.name + " has left the arena");
        notifyObservers();
    }

    private void notifyObservers() {
        for (Character character : characters) {
            System.out.println("Notifying " + character.name + " about the changes in the arena");
        }
    }

    public void characterAttack(Character attacker, Character target) {
        attacker.attack(target);
        if (target.health <= 0) {
            System.out.println(target.name + " has been defeated!");
            removeCharacter(target);
        }
    }

    public void characterMove(Character character, int newX, int newY) {
        character.move(newX, newY);
    }
}
