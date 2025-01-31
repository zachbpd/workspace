/**
 * Created by Andra on 24.02.2015.
 */
public class Favourites {
    private MusicTrack[] list = new MusicTrack[5];
    private int nr=0;

    public void addTrack(String artist, String title){
        MusicTrack m = new MusicTrack(artist, title);
        if (nr<5) {
            list[nr]=m;
            nr++;
        }
            else System.out.println("Sorry, can't add: " + m.toString() + "\n");
    }

    public void showFavourites(){
        for(int i=0;i<nr;i++)
            if(list[i]!=null) System.out.println(list[i]);
    }

    public static void main (String[] args){
        Favourites favourites = new Favourites();
        favourites.addTrack("Fun", "Some Nights");
        favourites.addTrack("Oliver Tank", "Help You Breathe");
        favourites.addTrack("Horse Feathers", "Fit Against the Country");
        favourites.addTrack("Emile Sande", "Country House");
        favourites.addTrack("Fun", "Walking the Dog");
        favourites.addTrack("Porcelain Raft", "Put Me To Sleep");
        favourites.showFavourites();
    }
}
