package mp3player;

class Device {
    private MediaPlayer mediaPlayer;

    public Device(MediaPlayer mediaPlayer) {
        this.mediaPlayer = mediaPlayer;
    }

    public void playAudio() {
        mediaPlayer.playAudio();
    }

    public void playVideo() {
        mediaPlayer.playVideo();
    }
}