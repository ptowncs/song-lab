public class Main {
    public static void main(String[] args){
        Read r = new Read();
        Song [] mySongs = r.readData();
        System.out.println("Longest:" + r.getLongestTitle(mySongs));
        System.out.println("Number of songs in 1982: " + r.songsInYear(mySongs, 1982));
        System.out.println("Number of songs in 2000: " + r.songsInYear(mySongs, 2000));
        System.out.println("Number of songs in 2015: " + r.songsInYear(mySongs, 2015));
        System.out.println("Number of songs with danceability less than 0.8: " +  r.getGreatestDanceability(mySongs, 0.8));
        System.out.println("Song with longest length: " + r.getLongestLen(mySongs));
        System.out.println("Lowest Shakeability: " + r.getLowShake(mySongs));
        System.out.println("Loudest: " + r.getLoudest(mySongs));

        System.out.println("Avg Obscenity in 1950s: " + r.avgObscenityPerDecade(mySongs, 1950));
        System.out.println("Avg Obscenity in 1960s: " + r.avgObscenityPerDecade(mySongs, 1960));
        System.out.println("Avg Obscenity in 1970s: " + r.avgObscenityPerDecade(mySongs, 1970));
        System.out.println("Avg Obscenity in 1980s: " + r.avgObscenityPerDecade(mySongs, 1980));
        System.out.println("Avg Obscenity in 1990s: " +r.avgObscenityPerDecade(mySongs, 1990));
        System.out.println("Avg Obscenity in 2000s: " +r.avgObscenityPerDecade(mySongs, 2000));
        System.out.println("Avg Obscenity in 2010s: " +r.avgObscenityPerDecade(mySongs, 2010));

        System.out.println("Number Songs with Michael Jackson: " + r.getNumArtist(mySongs, "michael jackson"));
        System.out.println("Number Songs with Whitney Houston: " + r.getNumArtist(mySongs, "whitney houston"));
    }
}
