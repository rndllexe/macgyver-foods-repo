package com.macgyverfoods.pickyeater;

import com.macgyverfoods.pickyeater.models.*;
import com.macgyverfoods.pickyeater.repositories.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.persistence.criteria.CriteriaBuilder;

@Component
public class Populator implements CommandLineRunner {

    @Resource
    private AllergyRepository allergyRepo;

    @Resource
    private ChildRepository childRepo;

    @Resource
    private FoodCategoryRepository foodCategoryRepo;

    @Resource
    private IngredientRepository ingredientRepo;

    @Resource
    private ParentRepository parentRepo;

    @Resource
    private PreferenceRepository preferenceRepo;

    @Resource
    private RecipeRepository recipeRepo;

    @Override
    public void run(String... args) throws Exception {

        Ingredient almondMilk = new Ingredient("Almond Milk");
        Ingredient butter = new Ingredient("Butter");
        Ingredient cheese = new Ingredient("Cheese");
        Ingredient coconutMilk = new Ingredient("Coconut Milk");
        Ingredient cream = new Ingredient("Cream");
        Ingredient goatCheese = new Ingredient("Goat Cheese");
        Ingredient iceCream = new Ingredient("Ice Cream");
        Ingredient milk = new Ingredient("Milk");
        Ingredient riceMilk = new Ingredient("Rice Milk");
        Ingredient sourCream = new Ingredient("Sour Cream");
        Ingredient soyMilk = new Ingredient("Soy Milk");
        Ingredient yogurt = new Ingredient("Yogurt");
        ingredientRepo.save(almondMilk);
        ingredientRepo.save(butter);
        ingredientRepo.save(cheese);
        ingredientRepo.save(coconutMilk);
        ingredientRepo.save(cream);
        ingredientRepo.save(goatCheese);
        ingredientRepo.save(iceCream);
        ingredientRepo.save(milk);
        ingredientRepo.save(riceMilk);
        ingredientRepo.save(sourCream);
        ingredientRepo.save(soyMilk);
        ingredientRepo.save(yogurt);

        Ingredient apple = new Ingredient("Apple");
        Ingredient avocado = new Ingredient("Avocado");
        Ingredient banana = new Ingredient("Banana");
        Ingredient blackberry = new Ingredient("Blackberry");
        Ingredient blueberry = new Ingredient("Blueberry");
        Ingredient clementine = new Ingredient("Clementine");
        Ingredient coconut = new Ingredient("Coconut");
        Ingredient cranberry = new Ingredient("Cranberry");
        Ingredient grapefruit = new Ingredient("Grapefruit");
        Ingredient honeydew = new Ingredient("Honeydew");
        Ingredient lemon = new Ingredient("Lemon");
        Ingredient lime = new Ingredient("Lime");
        Ingredient mango = new Ingredient("Mango");
        Ingredient orange = new Ingredient("Orange");
        Ingredient peach = new Ingredient("Peach");
        Ingredient pear = new Ingredient("Pear");
        Ingredient pineapple = new Ingredient("Pineapple");
        Ingredient raisin = new Ingredient("Raisin");
        Ingredient raspberry = new Ingredient("Raspberry");
        Ingredient strawberry = new Ingredient("Strawberry");
        Ingredient tomato = new Ingredient("Tomato");
        Ingredient watermelon = new Ingredient("Watermelon");
        ingredientRepo.save(apple);
        ingredientRepo.save(avocado);
        ingredientRepo.save(banana);
        ingredientRepo.save(blackberry);
        ingredientRepo.save(blueberry);
        ingredientRepo.save(clementine);
        ingredientRepo.save(coconut);
        ingredientRepo.save(cranberry);
        ingredientRepo.save(grapefruit);
        ingredientRepo.save(honeydew);
        ingredientRepo.save(lemon);
        ingredientRepo.save(lime);
        ingredientRepo.save(mango);
        ingredientRepo.save(orange);
        ingredientRepo.save(peach);
        ingredientRepo.save(pear);
        ingredientRepo.save(pineapple);
        ingredientRepo.save(raisin);
        ingredientRepo.save(raspberry);
        ingredientRepo.save(strawberry);
        ingredientRepo.save(tomato);
        ingredientRepo.save(watermelon);

        Ingredient bread = new Ingredient("Bread");
        Ingredient cereal = new Ingredient("Cereal");
        Ingredient corn = new Ingredient("Corn");
        Ingredient eggNoodle = new Ingredient("Egg Noodle");
        Ingredient flourTortilla = new Ingredient("Flour Tortilla");
        Ingredient oats = new Ingredient("Oats");
        Ingredient pasta = new Ingredient("Pasta");
        Ingredient pizzaCrust = new Ingredient("Pizza Crust");
        Ingredient ramenNoodle = new Ingredient("Ramen Noodle");
        Ingredient rice = new Ingredient("Rice");
        Ingredient riceNoodle = new Ingredient("Rice Noodle");
        Ingredient tacoShell = new Ingredient("Taco Shell");
        ingredientRepo.save(bread);
        ingredientRepo.save(cereal);
        ingredientRepo.save(corn);
        ingredientRepo.save(eggNoodle);
        ingredientRepo.save(flourTortilla);
        ingredientRepo.save(oats);
        ingredientRepo.save(pasta);
        ingredientRepo.save(pizzaCrust);
        ingredientRepo.save(ramenNoodle);
        ingredientRepo.save(rice);
        ingredientRepo.save(riceNoodle);
        ingredientRepo.save(tacoShell);

        Ingredient anchovies = new Ingredient("Anchovies");
        Ingredient bacon = new Ingredient("Bacon");
        Ingredient beef = new Ingredient("Beef");
        Ingredient chicken = new Ingredient("Chicken");
        Ingredient chickenBreast = new Ingredient("Chicken Breast");
        Ingredient cod = new Ingredient("Cod");
        Ingredient crab = new Ingredient("Crab");
        Ingredient eggs = new Ingredient("Eggs");
        Ingredient fish = new Ingredient("Fish");
        Ingredient ham = new Ingredient("Ham");
        Ingredient lamb = new Ingredient("Lamb");
        Ingredient lobster = new Ingredient("Lobster");
        Ingredient pepperoni = new Ingredient("Pepperoni");
        Ingredient porkChops = new Ingredient("Pork Chops");
        Ingredient porkSausage = new Ingredient("Pork Sausage");
        Ingredient porkShoulder = new Ingredient("Pork Shoulder");
        Ingredient porkTenderloin = new Ingredient("Pork Tenderloin");
        Ingredient salmon = new Ingredient("Salmon");
        Ingredient shrimp = new Ingredient("Shrimp");
        Ingredient tuna = new Ingredient("Tuna");
        Ingredient turkey = new Ingredient("Turkey");
        ingredientRepo.save(anchovies);
        ingredientRepo.save(bacon);
        ingredientRepo.save(beef);
        ingredientRepo.save(chicken);
        ingredientRepo.save(chickenBreast);
        ingredientRepo.save(cod);
        ingredientRepo.save(crab);
        ingredientRepo.save(eggs);
        ingredientRepo.save(fish);
        ingredientRepo.save(ham);
        ingredientRepo.save(lamb);
        ingredientRepo.save(lobster);
        ingredientRepo.save(pepperoni);
        ingredientRepo.save(porkChops);
        ingredientRepo.save(porkSausage);
        ingredientRepo.save(porkShoulder);
        ingredientRepo.save(porkTenderloin);
        ingredientRepo.save(salmon);
        ingredientRepo.save(shrimp);
        ingredientRepo.save(tuna);
        ingredientRepo.save(turkey);

        Ingredient bellPepper = new Ingredient("Bell Pepper");
        Ingredient broccoli = new Ingredient("Broccoli");
        Ingredient capsicum = new Ingredient("Capsicum");
        Ingredient carrot = new Ingredient("Carrot");
        Ingredient cauliflower = new Ingredient("Cauliflower");
        Ingredient celery = new Ingredient("Celery");
        Ingredient chilePepper = new Ingredient("Chile Pepper");
        Ingredient cucumber = new Ingredient("Cucumber");
        Ingredient eggplant = new Ingredient("Eggplant");
        Ingredient garlic = new Ingredient("Garlic");
        Ingredient jalapeno = new Ingredient("Jalapeno");
        Ingredient kale = new Ingredient("Kale");
        Ingredient leek = new Ingredient("Leek");
        Ingredient lettuce = new Ingredient("Lettuce");
        Ingredient mushroom = new Ingredient("Mushroom");
        Ingredient onion = new Ingredient("Onion");
        Ingredient potato = new Ingredient("Potato");
        Ingredient pumpkin = new Ingredient("Pumpkin");
        Ingredient radish = new Ingredient("Radish");
        Ingredient scallion = new Ingredient("Scallion");
        Ingredient shallot = new Ingredient("Shallot");
        Ingredient spinach = new Ingredient("Spinach");
        Ingredient sweetPotato = new Ingredient("Sweet Potato");
        Ingredient turnip = new Ingredient("Turnip");
        Ingredient zucchini = new Ingredient("Zucchini");
        ingredientRepo.save(bellPepper);
        ingredientRepo.save(broccoli);
        ingredientRepo.save(capsicum);
        ingredientRepo.save(carrot);
        ingredientRepo.save(cauliflower);
        ingredientRepo.save(celery);
        ingredientRepo.save(chilePepper);
        ingredientRepo.save(cucumber);
        ingredientRepo.save(eggplant);
        ingredientRepo.save(garlic);
        ingredientRepo.save(jalapeno);
        ingredientRepo.save(kale);
        ingredientRepo.save(leek);
        ingredientRepo.save(lettuce);
        ingredientRepo.save(mushroom);
        ingredientRepo.save(onion);
        ingredientRepo.save(potato);
        ingredientRepo.save(pumpkin);
        ingredientRepo.save(radish);
        ingredientRepo.save(scallion);
        ingredientRepo.save(shallot);
        ingredientRepo.save(spinach);
        ingredientRepo.save(sweetPotato);
        ingredientRepo.save(turnip);
        ingredientRepo.save(zucchini);

        FoodCategory dairy = new FoodCategory("Dairy","/dairy.jpg",
                almondMilk, butter, cheese, coconutMilk, cream, goatCheese, iceCream, milk, riceMilk, sourCream, soyMilk, yogurt);
        FoodCategory fruits = new FoodCategory("Fruits","/fruit_.jpg",
                apple, avocado, banana, blackberry, blueberry, clementine, coconut, cranberry, grapefruit, honeydew, lemon, lime, mango, orange, peach, pear, pineapple, raisin, raspberry, strawberry, tomato, watermelon);
        FoodCategory grains = new FoodCategory("Grains","/grains.jpg",
                bread, cereal, corn, flourTortilla, eggNoodle, oats, pasta, pizzaCrust, ramenNoodle, rice, riceNoodle, tacoShell);
        FoodCategory protein = new FoodCategory("Proteins","/protein.png",
                anchovies, bacon, beef, chicken, chickenBreast, cod, crab, eggs, fish, ham, lamb, lobster, pepperoni, porkChops, porkSausage, porkShoulder, porkTenderloin, salmon, shrimp, tuna, turkey);
        FoodCategory vegetables = new FoodCategory("Vegetables","/vegetables.jpg",
                bellPepper, broccoli, carrot, capsicum, cauliflower, celery, chilePepper, cucumber, eggplant, garlic, jalapeno, kale, leek, lettuce, mushroom, onion, potato, pumpkin, radish, scallion, shallot, spinach, sweetPotato, turnip, zucchini);
        foodCategoryRepo.save(dairy);
        foodCategoryRepo.save(fruits);
        foodCategoryRepo.save(grains);
        foodCategoryRepo.save(protein);
        foodCategoryRepo.save(vegetables);

        Preference almondMilk2 = new Preference("Almond Milk", dairy);
        Preference butter2 = new Preference("Butter",dairy);
        Preference cheese2 = new Preference("Cheese",dairy);
        Preference coconutMilk2 = new Preference("Coconut Milk", dairy);
        Preference cream2 = new Preference("Cream",dairy);
        Preference goatCheese2 = new Preference("Goat Cheese", dairy);
        Preference iceCream2 = new Preference("Ice Cream",dairy);
        Preference milk2 = new Preference("Milk",dairy);
        Preference riceMilk2 = new Preference("Rice Milk", dairy);
        Preference sourCream2 = new Preference("Sour Cream", dairy);
        Preference soyMilk2 = new Preference("Soy Milk", dairy);
        Preference yogurt2 = new Preference("Yogurt",dairy);
        preferenceRepo.save(almondMilk2);
        preferenceRepo.save(butter2);
        preferenceRepo.save(cheese2);
        preferenceRepo.save(coconutMilk2);
        preferenceRepo.save(cream2);
        preferenceRepo.save(goatCheese2);
        preferenceRepo.save(iceCream2);
        preferenceRepo.save(milk2);
        preferenceRepo.save(riceMilk2);
        preferenceRepo.save(sourCream2);
        preferenceRepo.save(soyMilk2);
        preferenceRepo.save(yogurt2);

        Preference apple2 = new Preference("Apple",fruits);
        Preference avocado2 = new Preference("Avocado",fruits);
        Preference banana2 = new Preference("Banana",fruits);
        Preference blackberry2 = new Preference("Blackberry", fruits);
        Preference blueberry2 = new Preference("Blueberry", fruits);
        Preference clementine2 = new Preference("Clementine", fruits);
        Preference coconut2 = new Preference("Coconut", fruits);
        Preference cranberry2 = new Preference("Cranberry", fruits);
        Preference grapefruit2 = new Preference("Grapefruit", fruits);
        Preference honeydew2 = new Preference("Honeydew", fruits);
        Preference lemon2 = new Preference("Lemon", fruits);
        Preference lime2 = new Preference("Lime", fruits);
        Preference mango2 = new Preference("Mango",fruits);
        Preference orange2 = new Preference("Orange",fruits);
        Preference peach2 = new Preference("Peach", fruits);
        Preference pear2 = new Preference("Pear",fruits);
        Preference pineapple2 = new Preference("Pineapple",fruits);
        Preference raisin2 = new Preference("Raisin", fruits);
        Preference raspberry2 = new Preference("Raspberry", fruits);
        Preference strawberry2 = new Preference("Strawberry",fruits);
        Preference tomato2 = new Preference("Tomato",fruits);
        Preference watermelon2 = new Preference("Watermelon",fruits);
        preferenceRepo.save(apple2);
        preferenceRepo.save(avocado2);
        preferenceRepo.save(banana2);
        preferenceRepo.save(blackberry2);
        preferenceRepo.save(blueberry2);
        preferenceRepo.save(clementine2);
        preferenceRepo.save(coconut2);
        preferenceRepo.save(cranberry2);
        preferenceRepo.save(grapefruit2);
        preferenceRepo.save(honeydew2);
        preferenceRepo.save(lemon2);
        preferenceRepo.save(lime2);
        preferenceRepo.save(mango2);
        preferenceRepo.save(orange2);
        preferenceRepo.save(peach2);
        preferenceRepo.save(pear2);
        preferenceRepo.save(pineapple2);
        preferenceRepo.save(raisin2);
        preferenceRepo.save(raspberry2);
        preferenceRepo.save(strawberry2);
        preferenceRepo.save(tomato2);
        preferenceRepo.save(watermelon2);

        Preference bread2 = new Preference("Bread",grains);
        Preference cereal2 = new Preference("Cereal",grains);
        Preference corn2 = new Preference("Corn",grains);
        Preference eggNoodle2 = new Preference("Egg Noodle", grains);
        Preference flourTortilla2 = new Preference("Flour Tortilla", grains);
        Preference oats2 = new Preference("Oats",grains);
        Preference pasta2 = new Preference("Pasta",grains);
        Preference pizzaCrust2 = new Preference("Pizza Crust", grains);
        Preference ramenNoodle2 = new Preference("Ramen Noodle", grains);
        Preference rice2 = new Preference("Rice",grains);
        Preference riceNoodle2 = new Preference("Rice Noodle", grains);
        Preference tacoShell2 = new Preference("Taco Shell", grains);
        preferenceRepo.save(bread2);
        preferenceRepo.save(cereal2);
        preferenceRepo.save(corn2);
        preferenceRepo.save(eggNoodle2);
        preferenceRepo.save(flourTortilla2);
        preferenceRepo.save(oats2);
        preferenceRepo.save(pasta2);
        preferenceRepo.save(pizzaCrust2);
        preferenceRepo.save(ramenNoodle2);
        preferenceRepo.save(rice2);
        preferenceRepo.save(riceNoodle2);
        preferenceRepo.save(tacoShell2);

        Preference anchovies2 = new Preference("Anchovies", protein);
        Preference bacon2 = new Preference("Bacon", protein);
        Preference beef2 = new Preference("Beef",protein);
        Preference chicken2 = new Preference("Chicken",protein);
        Preference chickenBreast2 = new Preference("Chicken Breast", protein);
        Preference cod2 = new Preference("Cod", protein);
        Preference crab2 = new Preference("Crab", protein);
        Preference eggs2 = new Preference("Eggs",protein);
        Preference fish2 = new Preference("Fish",protein);
        Preference ham2 = new Preference("Ham", protein);
        Preference lamb2 = new Preference("Lamb",protein);
        Preference lobster2 = new Preference("Lobster", protein);
        Preference pepperoni2 = new Preference("Pepperoni", protein);
        Preference porkChops2 = new Preference("Pork Chops", protein);
        Preference porkSausage2 = new Preference("Pork Sausage", protein);
        Preference porkShoulder2 = new Preference("Pork Shoulder", protein);
        Preference porkTenderloin2 = new Preference("Pork Tenderloin", protein);
        Preference salmon2 = new Preference("Salmon", protein);
        Preference shrimp2 = new Preference("Shrimp",protein);
        Preference tuna2 = new Preference("Tuna", protein);
        Preference turkey2 = new Preference("Turkey",protein);
        preferenceRepo.save(anchovies2);
        preferenceRepo.save(bacon2);
        preferenceRepo.save(beef2);
        preferenceRepo.save(chicken2);
        preferenceRepo.save(chickenBreast2);
        preferenceRepo.save(cod2);
        preferenceRepo.save(crab2);
        preferenceRepo.save(eggs2);
        preferenceRepo.save(fish2);
        preferenceRepo.save(ham2);
        preferenceRepo.save(lamb2);
        preferenceRepo.save(lobster2);
        preferenceRepo.save(pepperoni2);
        preferenceRepo.save(porkChops2);
        preferenceRepo.save(porkSausage2);
        preferenceRepo.save(porkShoulder2);
        preferenceRepo.save(porkTenderloin2);
        preferenceRepo.save(salmon2);
        preferenceRepo.save(shrimp2);
        preferenceRepo.save(tuna2);
        preferenceRepo.save(turkey2);

        Preference bellPepper2 = new Preference("Bell Pepper", vegetables);
        Preference broccoli2 = new Preference("Broccoli",vegetables);
        Preference capsicum2 = new Preference("Capsicum",vegetables);
        Preference carrot2 = new Preference("Carrot",vegetables);
        Preference cauliflower2 = new Preference("Cauliflower", vegetables);
        Preference celery2 = new Preference("Celery", vegetables);
        Preference chilePepper2 = new Preference("Chile Pepper", vegetables);
        Preference cucumber2 = new Preference("Cucumber", vegetables);
        Preference eggplant2 = new Preference("Eggplant", vegetables);
        Preference garlic2 = new Preference("Garlic", vegetables);
        Preference jalapeno2 = new Preference("Jalapeno", vegetables);
        Preference kale2 = new Preference("Kale", vegetables);
        Preference leek2 = new Preference("Leek", vegetables);
        Preference lettuce2 = new Preference("Lettuce",vegetables);
        Preference mushroom2 = new Preference("Mushroom",vegetables);
        Preference onion2 = new Preference("Onion",vegetables);
        Preference potato2 = new Preference("Potato",vegetables);
        Preference pumpkin2 = new Preference("Pumpkin", vegetables);
        Preference radish2 = new Preference("Radish", vegetables);
        Preference scallion2 = new Preference("Scallion", vegetables);
        Preference shallot2 = new Preference("Shallot", vegetables);
        Preference spinach2 = new Preference("Spinach", vegetables);
        Preference sweetPotato2 = new Preference("Sweet Potato", vegetables);
        Preference turnip2 = new Preference("Turnip", vegetables);
        Preference zucchini2 = new Preference("Zucchini",vegetables);
        preferenceRepo.save(bellPepper2);
        preferenceRepo.save(broccoli2);
        preferenceRepo.save(carrot2);
        preferenceRepo.save(capsicum2);
        preferenceRepo.save(cauliflower2);
        preferenceRepo.save(celery2);
        preferenceRepo.save(chilePepper2);
        preferenceRepo.save(cucumber2);
        preferenceRepo.save(eggplant2);
        preferenceRepo.save(garlic2);
        preferenceRepo.save(jalapeno2);
        preferenceRepo.save(kale2);
        preferenceRepo.save(leek2);
        preferenceRepo.save(lettuce2);
        preferenceRepo.save(mushroom2);
        preferenceRepo.save(onion2);
        preferenceRepo.save(potato2);
        preferenceRepo.save(pumpkin2);
        preferenceRepo.save(radish2);
        preferenceRepo.save(scallion2);
        preferenceRepo.save(shallot2);
        preferenceRepo.save(spinach2);
        preferenceRepo.save(sweetPotato2);
        preferenceRepo.save(turnip2);
        preferenceRepo.save(zucchini2);

        Allergy wheatAllergy = new Allergy("Wheat");
        Allergy eggsAllergy = new Allergy("Eggs");
        Allergy fishAllergy = new Allergy("Fish");
        Allergy sesameAllergy = new Allergy("Sesame");
        Allergy dairyAllergy = new Allergy("Dairy");
        Allergy peanutAllergy = new Allergy("Peanut");
        Allergy shellfishAllergy = new Allergy("Shellfish");
        Allergy soyAllergy = new Allergy("Soy");
        Allergy treeNutAllergy = new Allergy("Tree Nut");
        Allergy glutenAllergy = new Allergy("Gluten");
        Allergy grainAllergy = new Allergy("Grain");
        Allergy seaFoodAllergy = new Allergy("Seafood");
        Allergy sulfiteAllergy = new Allergy("Sulfite");
        allergyRepo.save(wheatAllergy);
        allergyRepo.save(eggsAllergy);
        allergyRepo.save(fishAllergy);
        allergyRepo.save(sesameAllergy);
        allergyRepo.save(dairyAllergy);
        allergyRepo.save(peanutAllergy);
        allergyRepo.save(shellfishAllergy);
        allergyRepo.save(soyAllergy);
        allergyRepo.save(treeNutAllergy);
        allergyRepo.save(glutenAllergy);
        allergyRepo.save(grainAllergy);
        allergyRepo.save(seaFoodAllergy);
        allergyRepo.save(sulfiteAllergy);

        Parent johnDoe = new Parent("John", "Doe", "johnDoe@gmail.com");
        parentRepo.save(johnDoe);
    }
}
