import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class Read {
    Song [] songs = new Song [28372];
    public Song[] readData(){
        try {
            Scanner in = new Scanner(new File("songs 2025-2026.csv"));
            int count = 0;
            in.nextLine();
            while(in.hasNext()){
                String line = in.nextLine();
                String artist = line.split(";")[0];
                String  title = line.split(";")[1];
                int year = Integer.parseInt(line.split(";")[2]);
                String genre = line.split(";")[3];
                int len = Integer.parseInt(line.split(";")[4]);
                double audienceShake = Double.parseDouble(line.split(";")[5]);
                double obscene = Double.parseDouble(line.split(";")[6]);
                double danceability = Double.parseDouble(line.split(";")[7]);
                double loudness = Double.parseDouble(line.split(";")[8]);
                String topic = line.split(";")[9];

                songs [count] = new Song (artist, title, year, genre, len, audienceShake, obscene, danceability,loudness, topic);
                
                System.out.println(count + " " + line);
                count++;
            }
            in.close();
        }catch(IOException e){
            System.out.println("File not found");
        }
        return songs;
    }
    public String getLongestTitle(Song [] array){
        String longest = "";
        for(int i = 0; i <28371; i++){
            String title = array[i].getTitle();
            if (title.length() > longest.length()){
                longest = title;
            }
        }
        return longest;
    }
    public String getLowShake(Song [] array){
        double lowShake = 0;
        String lowShakeSong= "";
        for (int i = 0; i < 28371; i++){
            if (lowShake != 0 || lowShake < array[i].getAudienceShake()){
                lowShake = array[i].getAudienceShake();
                lowShakeSong = array[i].getTitle();
            }
        }
        return lowShakeSong;
    }
    public int songInYear(Song [] array, int year){
        int num = 0;
        for(int i = 0; i < 28731; i++){
            if (array[i].getYear() == year){
                num+= 1;
            }
        }
        return num;       
    }
    public int getGreaterShakeability(Song [] array, double dance){
        int num = 0;
        for(int i = 0; i < 28731; i++){
            if(array[i].getDanceability() > dance){
                num+=1;
            }
        }
        return num;
    }
    public String getLongestLen(Song [] array){
        String longest = "";
        for(int i = 0; i <28371; i++){
            int len = array[i].getLength();
            if ( len > longest.length()){
                longest = array[i].getTitle();
            }
        }
        return longest;
    }
    public String getLoudest(Song [] array){
        String loud = "";
        for(int i = 0; i <28371; i++){
            double len = array[i].getLoudness();
            if (len > loud.length()){
                loud = array[i].getTitle();
            }
        }
        return loud;
    }
    public void avObscenityPerDecade(Song [] array){
        int decade = 1950;
        for(int i = 0; i < 28371; i++){
            int avgObscenity = 0;
            int count = 0;
            if (array[i].getYear()%decade < 10){
                count +=1;
                avgObscenity += array[i].getObscene();
            }else{
                decade += 10;
                continue;
            }
            avgObscenity/= count;
            System.out.print("Avg obscenity in:" + decade +":" + avgObscenity);
        }
    }
    public int getNumArtist(Song [] array, String artist){
        int num = 0;
        for(int i = 0; i < 28731; i++){
            if (array[i].getArtist().contains(artist)){
                num+=1;
            }
        }
        return num;
    }
}
