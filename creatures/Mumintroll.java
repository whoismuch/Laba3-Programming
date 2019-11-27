package laba3.creatures;

import laba3.environment.Space;
import laba3.environment.Light;

public class Mumintroll extends Character {


    public Mumintroll(String name, int age, Gender smbdGender, Direction dir, Space space){
        super(name, age, smbdGender, dir, space );
    }
    @Override
    public String toString() {
        return "Mimutrooll[имя = " + this.getName() + ", возраст = " +
                this.getAge() + ", пол = " + this.getSmbdGender() +
                ", смотрит на  " + this.getDir() + ", находится "+ this.getSpace() + "]";
    }
    @Override
    public int hashCode(){
        int result = 5;
        result = this.getName().hashCode() * 7 + result;
        result = this.getAge() * 7 + result;
        result = this.getSmbdGender().hashCode() * 7 + result;
        return result;
    }
    @Override
    public boolean equals (Object o){
        if (this == o) {
            return true;
        }

        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        Mumintroll mumintroll = (Mumintroll) o;
        return this.getCoordinatex() == mumintroll.getCoordinatex() &&
                this.getCoordinatey() == mumintroll.getCoordinatey() &&
                this.getName().equals(mumintroll.getName());
    }
}
