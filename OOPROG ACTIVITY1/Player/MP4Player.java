package mp3player;

class MP4Player implements MediaPlayer {
    @Override
    public void playAudio() {
        System.out.println("MP4Player playing audio.");
    }

    @Override
    public void playVideo() {
        System.out.println("MP4Player playing video.");
    }
}
