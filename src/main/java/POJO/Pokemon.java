package POJO;

import java.util.Objects;

public class Pokemon {
    private int id;
    private String name;
    private String total;
    private String hp;
    private String attack;
    private String defence;
    private String spAtk;
    private String spDef;
    private String speed;
    private String type;

    public Pokemon(int id, String name, String total, String hp, String attack, String defence, String spAtk, String spDef, String speed, String type) {
        this.id = id;
        this.name = name;
        this.total = total;
        this.hp = hp;
        this.attack = attack;
        this.defence = defence;
        this.spAtk = spAtk;
        this.spDef = spDef;
        this.speed = speed;
        this.type = type;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTotal() {
        return this.total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getHp() {
        return this.hp;
    }

    public void setHp(String hp) {
        this.hp = hp;
    }

    public String getAttack() {
        return this.attack;
    }

    public void setAttack(String attack) {
        this.attack = attack;
    }

    public String getDefence() {
        return this.defence;
    }

    public void setDefence(String defence) {
        this.defence = defence;
    }

    public String getSpAtk() {
        return this.spAtk;
    }

    public void setSpAtk(String spAtk) {
        this.spAtk = spAtk;
    }

    public String getSpDef() {
        return this.spDef;
    }

    public void setSpDef(String spDef) {
        this.spDef = spDef;
    }

    public String getSpeed() {
        return this.speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o != null && this.getClass() == o.getClass()) {
            Pokemon pokemon = (Pokemon)o;
            return this.id == pokemon.id && Objects.equals(this.name, pokemon.name) && Objects.equals(this.total, pokemon.total) && Objects.equals(this.hp, pokemon.hp) && Objects.equals(this.attack, pokemon.attack) && Objects.equals(this.defence, pokemon.defence) && Objects.equals(this.spAtk, pokemon.spAtk) && Objects.equals(this.spDef, pokemon.spDef) && Objects.equals(this.speed, pokemon.speed) && Objects.equals(this.type, pokemon.type);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.id, this.name, this.total, this.hp, this.attack, this.defence, this.spAtk, this.spDef, this.speed, this.type});
    }

    /*public String toString() {
        return "|  " + this.id + "   |   " + this.total + "   |   " + this.hp + "   |   " + this.attack + "   |   " + this.defence + "   |   " + this.spAtk + "   |   " + this.spDef + "   |   " + this.speed + "   |   " + this.name + "   |   " + this.type + "   |";
    }*/

    @Override
    public String toString() {
        return  "id = " + id +
                ",  name: " + name + '\'' +
                ",  total = " + total  +
                ",  hp = " + hp  +
                ",  attack = " + attack +
                ",  defence = " + defence +
                ",  spAtk = " + spAtk +
                ",  spDef = " + spDef +
                ",  speed = " + speed +
                ",  type = " + type;
    }
}
