import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class Read {
    public void readData(){
        try {
            Scanner in = new Scanner(new File("songs 2025-2026.csv"));
            while(in.hasNext()){
                System.out.print(in.nextLine());
            }
            in.close();
        }catch(IOException e){
            System.out.println("File not found");
        }
    }
}
