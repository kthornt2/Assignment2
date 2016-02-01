public class BeerSong {

    public static void main(String[] args) {
        Ninety_Nine_Bottles();

    }


    public static void Ninety_Nine_Bottles(){
        int beers=99;
        String name="bottles";
        while(beers>1){
            System.out.println();
            System.out.println(beers + " " + name + " " + "of beer on the wall," + beers + " " + name + " " +"of beer," );
            beers--;
            if(beers>1)
            {
                System.out.println("take one down,pass it around," + beers + " " + name + " " + "of beer on the wall.");
            }
            else
            {
                name = "bottle";
                System.out.println("take one down,pass it around," + beers + " " + name + " " + "of beer on the wall");
            }
        }
        System.out.println();
        System.out.println(beers + " " + name + " " + "of beer on the wall," + beers + " " + name + " " + "of beer," );
        System.out.println("take one down,pass it around," + "no more bottles of beer on the wall");

    }
}