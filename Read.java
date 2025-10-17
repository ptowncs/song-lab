import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class Read {
    Song [] songs = new Song [28372];
    public void readData(){
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
}
