public class Main {

    public static void main(String[] args) {

        SmartKitchen kitchen = new SmartKitchen();


        kitchen.setKitchenState(true,true,false);
        kitchen.doKitchenWork();


//        kitchen.getDishWasher().setHasWorkToDo(true);
//        kitchen.getBrewMaster().setHasWorkToDo(true);
//        kitchen.getIceBox().setHasWorkToDo(true);
//
//        kitchen.getDishWasher().doDishes();
//        kitchen.getBrewMaster().brewCoffee();
//        kitchen.getIceBox().orderFood();

    }

}
