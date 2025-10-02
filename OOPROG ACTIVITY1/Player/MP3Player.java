package mp3player;

class MP3Player implements MediaPlayer {
    @Override
    public void playAudio() {
        System.out.println("MP3Player playing audio.");
    }

    @Override
    public void playVideo() {
        System.out.println("MP3Player cannot play video.");
    }
}