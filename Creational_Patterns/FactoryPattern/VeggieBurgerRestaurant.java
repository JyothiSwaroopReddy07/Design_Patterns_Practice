package FactoryPattern;

public class VeggieBurgerRestaurant extends Restaurant{

    @Override
    public Burger createBurger() {
        Burger burger = new VegBurger();
        return burger;
    }
}
