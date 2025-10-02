package mp3player;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a player:");
        System.out.println("1. MP3Player");
        System.out.println("2. MP4Player");
        int choice = scanner.nextInt();

        MediaPlayer player;
        if (choice == 1) {
            player = new MP3Player();
            System.out.println("You chose MP3Player:");
        } else {
            player = new MP4Player();
            System.out.println("You chose MP4Player:");
        }

        // Test directly
        player.playAudio();
        player.playVideo();

        System.out.println();

        // Test with Device
        Device device = new Device(player);
        System.out.println("Using Device:");
        device.playAudio();
        device.playVideo();

        scanner.close();
    }
}