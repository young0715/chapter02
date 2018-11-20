package ex03;

public class SongApp {

	public static void main(String[] args) {
		
		Song song = new Song();
		song.setTitle("좋은날");
		song.setArtist("아이유");
		song.setAlbum("Real");
		song.setComposer("이민수");
		song.setYear(2010);
		song.setTrack(3);
		song.show();
		
		Song song2 = new Song("좋은날2", "아이유2", "", "", 0, 0);
		song2.show();
	}

}
