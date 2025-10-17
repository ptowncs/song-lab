public class Song {
    private String artist;
    private String title;
    private int year;
    private String genre;
    private int len;
    private double audienceShake;
    private double obscene;
    private double danceability;
    private double loudness;
    private String topic;
    
    public Song(String artist, String title, int year, String genre, int len, double audienceShake, double obscene, double danceability, double loudness, String topic){
        this.artist = artist;
        this.title = title;
        this.year = year;
        this.genre = genre;
        this.len = len;
        this.audienceShake = audienceShake;
        this.obscene = obscene;
        this.danceability = danceability;
        this.loudness = loudness;
        this.topic = topic;
    }
    public String getArtist(){
        return this.artist;
    
    }
    public String getTitle(){
        return this.title;
    }
    public int getYear(){
        return this.year;
    }
    public String getGenre(){
        return this.genre;
    }
    public int getLength(){
        return this.len;
    }
    public double getAudienceShake(){
        return this.audienceShake;
    }
    public double getObscene(){
        return this.obscene;
    }
    public double getDanceability(){
        return this.danceability;
    }
    public double getLoudness(){
        return this.loudness;
    }
    public String getTopic(){
        return this.topic;
    }
}
