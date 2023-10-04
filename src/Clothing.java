public class Clothing {

    public String type;

    public String color;

    public int size;

    public static int numClothes;

    public static void main (String[] arg){

        Clothing.numClothes = 0;

        Clothing gClothing = new Clothing ();


        gClothing.type = "shirt";
        gClothing.color = "white";
        gClothing.size= 48;

        numClothes++;


//        System.out.println(gClothing.type);
//        System.out.println(gClothing.color);
//        System.out.println(gClothing.size);

        System.out.println("number of outfits so far is: " + numClothes);
        System.out.printf("Today G wore a %s, that was %s, and it was a size %d.%n", gClothing.type, gClothing.color, gClothing.size);



        Clothing aClothing = new Clothing();

        aClothing.type = "ButtonUp";
        aClothing.color = "Red";
        aClothing.size = 20;

        numClothes++;

        System.out.println(aClothing.type);
        System.out.println(aClothing.color);
        System.out.println(aClothing.size);

        System.out.println("number of outfits so far is: " + numClothes);
        System.out.printf("Today A wore a %s, that was %s, and it was a size %d.%n", aClothing.type, aClothing.color, aClothing.size);

    }
}
