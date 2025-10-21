public class Main {
    public static void main(String[] args){
        Read r = new Read();
        Song [] mySongs = r.readData();
        System.out.println("Longest:" + r.getLongestTitle(mySongs));
    }
}
